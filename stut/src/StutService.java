
import java.time.LocalDate;
import java.time.LocalTime;
import org.simpleframework.http.Query;
import org.simpleframework.http.Request;

public class StutService {
	private Stut lista = new Stut();

	/**
	 * Cadastro contrato tipo Aluno
	 * @param request
	 * @return
	 */
	public String contratoPassageiro(Request request) {
		String resp = "erro";
		Pessoa aluno = null;
		Query query = request.getQuery();
		// Query Aluno
		String nome = query.get("nome");
		LocalDate dataNascimento = LocalDate.parse(query.get("dataNascimento"));
		String cpf = query.get("cpf");
		String rg = query.get("rg");
		int idade = query.getInteger("idade");
		String tel = query.get("tel");
		String email = query.get("email");
		String senha = query.get("senha");
		String responsavel = query.get("responsavel");
		
		// Query Endere�o Aluno
		String ruaAluno = query.get("rua");
		int numAluno = query.getInteger("numero");
		String bairroAluno = query.get("bairro");
		String cidadeAluno = query.get("cidade");
		String estadoAluno = query.get("estado");
		String cepAluno = query.get("cep");
		
		// Query Cartao
		String banco = query.get("banco");
		String bandeiraCartao = query.get("bandeiraCartao");
		String numCartao = query.get("numCartao");
		int codigoCartao = query.getInteger("codigoCartao");
		LocalDate dataValidade = LocalDate.parse(query.get("dataValidade"));

		// Query Turma
		//int turmaNum = query.getInteger("turma");

		// Contrato Aluno
		String formaPgto = query.get("formaPgto");
		String assinaturaPagto = query.get("assinaturaPagto");
		String servico = query.get("servico");
		LocalDate inicioContrato = LocalDate.parse(query.get("inicioContrato"));
		LocalDate fimContrato = LocalDate.parse(query.get("fimContrato"));
		int percentualMulta = 50;
		String status = "Ativo";
		LocalTime recolhimentoCasa = LocalTime.parse(query.get("recolhimentoCasa"));
		LocalTime recolhimentoFaculdade = LocalTime.parse(query.get("recolhimentoFaculdade"));
		LocalTime entregaCasa = LocalTime.parse(query.get("entregaCasa"));
		LocalTime entregaFaculdade = LocalTime.parse(query.get("entregaFaculdade"));

		Endereco endAluno = new Endereco(ruaAluno, numAluno, bairroAluno, cidadeAluno, estadoAluno, cepAluno);
		CartaoCredito cartaoCls = new CartaoCredito(banco, bandeiraCartao, numCartao, codigoCartao, dataValidade);
		ContratoAluno contrato = new ContratoAluno(formaPgto, assinaturaPagto, servico, inicioContrato, fimContrato,
				percentualMulta, status, recolhimentoCasa, recolhimentoFaculdade, entregaCasa, entregaFaculdade);

		aluno = new Aluno(nome, dataNascimento, idade, cpf, rg,
				tel, endAluno, email, senha, responsavel, contrato,
				null, cartaoCls);

		if (aluno != null) {
			lista.inserirCliente((Aluno) aluno);
			lista.alunoPorBairro((Aluno) aluno);
			lista.inserirEmTurma((Aluno)aluno);
			resp = "ok";
		}

		return resp;
		//return aluno.toString();

	} // Fim cadastro
	
	/**
	 * Total clientes tipo Aluno cadastrato na Stut
	 * @param request
	 * @return
	 */
	public String totalAlunos(Request request) {
		return Integer.toString(lista.quantCliente());
	}
	
	/**
	 * Consultar cliente do tipo aluno atrv�s do cpf
	 * @param request
	 * @return
	 */
	public String consultarClientes(Request request) {
		Query query = request.getQuery();
		String cpf = query.get("cpf");
		System.out.println("retorno = " + lista.consultarClientes(cpf));
		Aluno a = lista.consultarClientes(cpf);
		System.out.println(a.toString());
		return a.toString();
	}

	/**
	 * 
	 * @param cpf
	 * @param tipoU
	 * @return
	 */

	public String getJSONTurma(String cpf, String tipoU){
		String resp = null;
		if(tipoU.equals("motorista")){ 
			for (int i = 0; i < lista.quantMotorista(); i++) {
				Motorista aux = lista.consultarFornecedor(i);
				if(aux.getCpf().equals(cpf)){
					resp =  aux.getTurma().getRotaDia();
				}
			}
		}else{
			for (int i = 0; i < lista.quantCliente(); i++) {
				Aluno aux = lista.consultarClientes2(i);
				if(aux.getCpf().equals(cpf)){
					//resp =  aux.getTurma().getRotaDia();
				}
			}
		}
		return resp;
	}

	public String getAlunoAutenticado(String cpf, String senha) {
		Aluno a = lista.consultarClientes(cpf);
		String resp = "0";
		if(a != null){
			if(a.getSenha().equals(senha)){
				a.setEstalogado(true);
				resp = "1";
			}
		}
		return resp;
	}

	public String getMotoristaAutenticado(String identificador, String senha) {
		Motorista m = lista.consultarFornecedor(identificador);
		String resp = "0";
		if(m != null){
			if(m.getSenha().equals(senha)){
				m.setEstalogado(true);
			resp = "1";
			}
		}
		return resp;
	}

	public boolean getEstaLogado(String cpf) {
		return lista.consultarClientes(cpf).isEstalogado();
	}
}
