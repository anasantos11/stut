
import java.time.LocalDate;
import java.time.LocalTime;
<<<<<<< HEAD
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Calendar;
=======

>>>>>>> 6c126b612dfaeeac964def5d2da5eb4d77b609b6

import org.simpleframework.http.Query;
import org.simpleframework.http.Request;

public class ServiceCliente {
	private int j;
	public LinkedList<LinkedList<Aluno>> lb = new LinkedList<LinkedList<Aluno>>();
	public LinkedList<Turma> lt = new LinkedList<Turma>();
	private Stut lista;

	public String contratoPassageiro(Request request) {
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

		// Query Faculdade
		String faculdade = query.get("faculdade");
		String cartao = query.get("cartao");
		String turma = query.get("turma");
		int ausencias = query.getInteger("ausencias");
		
		// Query Cartao
		int banco = query.getInteger("banco");
		String bandeiraCartao = query.get("bandeiraCartao");
		int numCartao = query.getInteger("numCartao");
		int codigoCartao = query.getInteger("codigoCartao");
		LocalDate dataValidade = LocalDate.parse(query.get("dataValidade"));

		// Query Turma
		int turmaNum = query.getInteger("turma");

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
		CartaoCredito cartao = new CartaoCredito(banco, bandeiraCartao, numCartao, codigoCartao, dataValidade);
		ContratoAluno contrato = new ContratoAluno(formaPgto, assinaturaPagto, servico, inicioContrato, fimContrato,
				percentualMulta, status, recolhimentoCasa, recolhimentoFaculdade, entregaCasa, entregaFaculdade);

		aluno = new Aluno(nome, dataNascimento, idade, cpf, rg, tel, endAluno, email, senha, responsavel, contrato,
				faculdade, cartao, turma);

		if (aluno != null) {
			lb = insereListBairros(lb, (Aluno) aluno);
			lt = insereTurma(lt, (Aluno)aluno);
			lista.inserirCliente((Aluno) aluno);
		}
		return aluno.toString();
	} // Fim cadastro

	public String totalAlunos(Request request) {
		return Integer.toString(lista.quantCliente());

	}
	
	public String consultarClientes(Request request) {
		Aluno a = lista.consultarClientes();
		return a.toString();

	}

	public ServiceCliente() {
		lista = new Stut();
	}
	
	private LinkedList<Turma> insereTurma(LinkedList<Turma> x, Aluno aluno) {
		 
		lt.forEach(y -> {
			// pro futuro String bairroTurma = y.verificarAlunos().get(0).getEndereco().getBairro();
			// pro futuro String bairroAluno = aluno.getEndereco().getBairro();
			boolean temEspaco = y.getMotorista().temAssentos();
			
			if(temEspaco){
				y.verificarAlunos().add(aluno);
				y.ordenarRota();
			}
		});
		return x;
	}

	private LinkedList<LinkedList<Aluno>> insereListBairros(LinkedList<LinkedList<Aluno>> a, Aluno aluno){
		int i = lb.size();
		for (j = 0; j < i; j++) {
			lb.get(j).forEach(x -> {
				if(x.getEndereco().getBairro().equals(aluno.getEndereco().getBairro())){
					lb.get(j).add(aluno);
				}else if(j == (i-1)){
					LinkedList<Aluno> aux = new LinkedList<Aluno>();
					aux.add(aluno);
					lb.add(aux);
				}
			});
		}
		return a;
	}

}
