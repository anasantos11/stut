import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import org.simpleframework.http.Query;
import org.simpleframework.http.Request;

public class StutService {
	private int j;
	private ListaTeste lista;
	public LinkedList<LinkedList<Aluno>> lb = new LinkedList<LinkedList<Aluno>>();
	public LinkedList<Turma> lt = new LinkedList<Turma>();
	private String cadastroUsuario(Request request) {
		Aluno aluno = null;

		Query query = request.getQuery();
		// Query Aluno
		String nome = query.get("nome");
		LocalDate dataNascimento = LocalDate.parse(query.get("dataNascimento"));
		String cpf = query.get("cpf");
		String rg = query.get("rg");
		
		// Query Endere�o Aluno
		String ruaAluno = query.get("rua");
		int numAluno = query.getInteger("numero");
		String bairroAluno = query.get("bairro");
		String cidadeAluno = query.get("cidade");
		String estadoAluno = query.get("estado");
		String cepAluno = query.get("cep");
		
		// Query Aluno
		int idade = query.getInteger("idade");
		String tel = query.get("tel");
		String email = query.get("email");
		String senha = query.get("senha");
		String responsavel = query.get("responsavel");
		
		// Query Faculdade
		String faculdade = query.get("faculdade");
		String cartao = query.get("cartao");
		String turma = query.get("turma");
		int ausencias = query.getInteger("ausencias");

		// Contrato
		String formaPgto = query.get("formaPgto");
		String assinaturaPagto = query.get("assinaturaPagto");
		String servico = query.get("servico");
		LocalDate inicioContrato = LocalDate.parse(query.get("inicioContrato"));
		LocalDate fimContrato = LocalDate.parse(query.get("fimContrato"));
		int percentualMulta = query.getInteger("percentualMulta");
		String status = query.get("status");
		LocalTime recolhimentoCasa = LocalTime.parse(query.get("recolhimentoCasa"));
		LocalTime recolhimentoFaculdade = LocalTime.parse(query.get("recolhimentoFaculdade"));
		LocalTime entregaCasa = LocalTime.parse(query.get("entregaCasa"));
		LocalTime entregaFaculdade = LocalTime.parse(query.get("entregaFaculdade"));

		Endereco endAluno = new Endereco(ruaAluno, numAluno, bairroAluno, cidadeAluno, estadoAluno, cepAluno);
		ContratoAluno contratoAluno = new ContratoAluno(formaPgto, assinaturaPagto, servico, inicioContrato,
				fimContrato, percentualMulta, status, recolhimentoCasa, recolhimentoFaculdade, entregaCasa,
				entregaFaculdade);

		aluno = new Aluno(nome, dataNascimento, idade, cpf, rg, tel, endAluno, email, senha, responsavel, contratoAluno,
				faculdade, cartao, turma);
		
		if (aluno != null) {
			lista.adicionar((Aluno) aluno);		
			lb = insereListBairros(lb, aluno);
			lt = insereTurma(lt, aluno);
		}
		return aluno.toString();
	}
	
	private LinkedList<Turma> insereTurma(LinkedList<Turma> x, Aluno aluno) {
		 
		lt.forEach(y -> {
			// pro futuro String bairroTurma = y.verificarAlunos().get(0).getEndereco().getBairro();
			String bairroAluno = aluno.getEndereco().getBairro();
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

	/*
	 * public String adicionarProduto(Request request) {
	 * 
	 * switch (tipo) { case 1: p = new BemDuravel(descricao, preco, quant,
	 * dataFabricacao, 12); break; case 2: p = new BemDeConsumo(descricao,
	 * preco, quant, dataFabricacao,
	 * dataFabricacao.plusMonths(12).toLocalDate()); break; } if (p != null) {
	 * estoque.adicionar(p); }
	 * 
	 * return p.toString();
	 * 
	 * }
	 */
}
