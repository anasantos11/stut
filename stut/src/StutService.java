
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
		
		// Query Endereço Aluno
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
	 * Consultar cliente do tipo aluno atrvés do cpf
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
		String resp = "Não encontrado";
		if(tipoU.equals("motorista")){ 
			Motorista aux = lista.consultarFornecedor(cpf);
			if(aux != null){
				resp =  aux.getTurma().getRotaDia();
			}
		}else{
			Aluno aux = lista.consultarClientes(cpf);
			if(aux != null){
				resp =  aux.getTurma().getRotaDia();
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
	
	/**
	 * Método havia sido criado com o intuito de criar a turma e inserir alguns alunos para 
	 * apresentação do sistema em aula. 
	 */
	public void atualizarSistema(){
		Endereco endMotorista = new Endereco("Avenida Bias Fortes", 160, "Carlos Prates", "Belo Horizonte", "MG",
				"30710045");
		Motorista sebastiao = new Motorista("Sebastião", LocalDate.of(1973, 02, 02), 44, "12345", "46587423",
				"31977554422", endMotorista, "m@teste.com", "m2256", null, null, 20, "5AS55A1SA51", null);

		Endereco endVinicius = new Endereco("Avenida Cisne", 160, "Lagoa dos Ingleses", "Belo Horizonte", "MG",
				"34018010");
		ContratoAluno conVinicius = new ContratoAluno("Cartão de crédito", "Semestral", "Volta",
				LocalDate.of(2017, 01, 01), LocalDate.of(2017, 07, 01), 50, "Ativo", LocalTime.of(18, 00),
				LocalTime.of(18, 00), LocalTime.of(18, 00), LocalTime.of(18, 00));
		Endereco endPuc = new Endereco("Claudio Manoel", 1205, "Funcionários", "Belo Horizonte", "MG", "30140108");
		Faculdade facul = new Faculdade("Puc Minas", endPuc);
		CartaoCredito cartaoVini = new CartaoCredito("341 - Itaú", "Mastercard", "3378554422116655", 447,
				LocalDate.of(2018, 01, 01));
		Aluno vinicius = new Aluno("Vinicius", LocalDate.of(1989, 01, 03), 28, "09525476889", "16478574",
				"031998758744", endVinicius, "v@teste.com", "v1234", null, conVinicius, facul, cartaoVini);

		Endereco aluno = new Endereco("Rua Joaquim Henriques Cardoso", 224, "Ouro Preto", "Belo Horizonte", "MG",
				"31320100");
		ContratoAluno conBruna = new ContratoAluno("Dinheiro", "Mensal", "Ida", LocalDate.of(2017, 02, 10),
				LocalDate.of(2017, 07, 20), 50, "Ativo", LocalTime.of(18, 30), LocalTime.of(22, 50),
				LocalTime.of(23, 30), LocalTime.of(19, 40));
		Aluno bruna = new Aluno("Bruna", LocalDate.of(1999, 01, 01), 18, "5565656565", "5445453", "31988775544", aluno,
				"bruna@teste.com", "as54as", null, conBruna, facul, null);
		Turma stut = new Turma(sebastiao);
		
		lista.inserirCliente((Aluno) vinicius);
		lista.inserirCliente((Aluno) bruna);
		lista.alunoPorBairro((Aluno) vinicius);
		lista.alunoPorBairro((Aluno) bruna);
		lista.inserirEmTurma((Aluno) bruna );
		
	}


}
