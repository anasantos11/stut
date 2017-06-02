import java.time.LocalTime;
import java.util.Map;
import java.util.TreeMap;

public class Viagem {
	private Turma turma;
	private Rota rota;

	public Viagem(Turma turma, Rota rota) {
		
	}

	/**
	 * Gera rota atualizada devido a ausência de alunos
	 * @param a
	 * @return
	 */
	
	public void comunicarInicioViagem() {
		
	}

	public LocalTime calcularTempo() {
		return null;
	}
	public String rotaAtualizadaPadraoJson(TreeMap<LocalTime, Aluno> a){
		String jsonAlunos = "{Alunos : {";
		for (Map.Entry<LocalTime, Aluno> x : a.entrySet()){
			if(!x.getValue().ehAusente()){
				jsonAlunos += "[{\"nome :\" \" " + x.getValue().getNome() + "\"," +
						"\"tel :\" \" " + x.getValue().getTel() + "\"," +
						"\"ruaAl\" : \" " + x.getValue().getEndereco().getRua() + "\"," +
						"\"bairroAl\" : \" " + x.getValue().getEndereco().getBairro() + "\"," +
						"\"numeroEndAl\" : \" " + x.getValue().getEndereco().getNumero() + "\"," +
						"\"cepAl\" : \" " + x.getValue().getEndereco().getCep() + "\"," +
						"\"nomeFac\" : \" " + x.getValue().getFaculdade().getNome() + "\"," +
						"\"ruaFac\" : \" " + x.getValue().getFaculdade().getEndereco().getRua() + "\"," +
						"\"bairroFac\" : \" " + x.getValue().getFaculdade().getEndereco().getBairro() + "\"," +
						"\"numeorEndFac\" : \" " + x.getValue().getFaculdade().getEndereco().getNumero() + "\"," +
						"\"cepFac\" : \" " + x.getValue().getFaculdade().getEndereco().getCep() + "\"}],";
			}
		}
		jsonAlunos += "[]}}";
		return jsonAlunos;
	}
	



}
