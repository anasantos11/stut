import java.awt.Desktop;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;

import org.json.JSONException;
import org.json.JSONObject;

import org.simpleframework.http.Request;
import org.simpleframework.http.Response;
import org.simpleframework.http.Status;
import org.simpleframework.http.core.Container;
import org.simpleframework.http.core.ContainerSocketProcessor;
import org.simpleframework.transport.connect.Connection;
import org.simpleframework.transport.connect.SocketConnection;

public class URLMetodo implements Container {

	static StutService stutService;

	public void handle(Request request, Response response) {
		try {
			// Recupera a URL e o método utilizado.

			String path = request.getPath().getPath();
			String method = request.getMethod();
			String mensagem;

			if (path.startsWith("/contratoPassageiro") && "POST".equals(method)) {
				mensagem = stutService.contratoPassageiro(request);
				this.enviaResposta(Status.CREATED, response, mensagem);

			} else if (path.startsWith("/totalAlunos") && "GET".equals(method)) {
				mensagem = stutService.totalAlunos(request);
				this.enviaResposta(Status.OK, response, mensagem);
			} else if (path.startsWith("/consultarClientes") && "GET".equals(method)) {
				mensagem = stutService.consultarClientes(request);
				this.enviaResposta(Status.OK, response, mensagem);

			}else if (path.startsWith("/requisitarTurma") && "POST".equals(method)) {
				String[] aux = path.split("/");
				String identificador = aux[(aux.length - 2)];
				String tipoU = aux[(aux.length - 1)];
				mensagem = stutService.getJSONTurma(identificador, tipoU);
				this.enviaResposta(Status.OK, response, mensagem);

			}  else if (path.startsWith("/logarUsuario") && "POST".equals(method)) {
				String[] aux = path.split("/");
				String identificador = aux[(aux.length - 3)];
				String senha = aux[(aux.length - 2)];
				String tipoU = aux[(aux.length - 1)];
				System.out.println(tipoU);
				if (tipoU.equals("al")) {
					if (tipoU.equals("al")) {
						System.out.println(identificador);
						System.out.println(senha);
						mensagem = stutService.getAlunoAutenticado(identificador, senha);
					} else {
						mensagem = stutService.getMotoristaAutenticado(identificador, senha);
					}
					this.enviaResposta(Status.OK, response, mensagem);

					System.out.println(mensagem);
					this.enviaResposta(Status.OK, response, mensagem);
				} else if (path.startsWith("/getAutenticacao") && "POST".equals(method)) {
					String[] aux2 = path.split("?");
					boolean x = stutService.getEstaLogado(aux2[1]);
					this.enviaResposta(Status.OK, response, "" + x);

				} else {
					this.naoEncontrado(response, path);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void naoEncontrado(Response response, String path) throws Exception {
		JSONObject error = new JSONObject();
		error.put("error", "Não encontrado.");
		error.put("path", path);
		enviaResposta(Status.NOT_FOUND, response, error.toString());
	}

	private void enviaResposta(Status status, Response response, String str) throws Exception {

		PrintStream body = response.getPrintStream();
		long time = System.currentTimeMillis();
		response.setValue("Access-Control-Allow-Origin", "*");
		response.setValue("Access-Control-Allow-Methods", "GET,POST");
		response.setValue("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		response.setValue("Content-Type", "application/json");
		response.setValue("Server", "StuT - Transporte Universitário(1.0)");
		response.setDate("Date", time);
		response.setDate("Last-Modified", time);
		response.setStatus(status);

		body.println(str);
		body.close();

	}

	public JSONObject toJSON() throws JSONException {
		JSONObject json = new JSONObject();
		json.put("id", 2);
		json.put("text", "teste");
		return json;
	}

	public static void main(String[] list) throws Exception {

		stutService = new StutService();

		int porta = 8080;

		// Configura uma conexão soquete para o servidor HTTP.
		Container container = new URLMetodo();
		ContainerSocketProcessor servidor = new ContainerSocketProcessor(container);
		Connection conexao = new SocketConnection(servidor);
		SocketAddress endereco = new InetSocketAddress(porta);
		conexao.connect(endereco);

		// Testa a conexão abrindo o navegador padrão.
		// Desktop.getDesktop().browse(new URI("http://localhost:" + porta));
		Desktop.getDesktop().browse(new URI("http://127.0.0.1:" + porta));

		System.out.println("Tecle ENTER para interromper o servidor...");
		System.in.read();

		conexao.close();
		servidor.stop();

	}

}
