import java.time.LocalDate;

public class Motorista extends Pessoa {

	public Motorista(String nome, LocalDate dataNascimento, int idade, String cpf, String identidade, String tel,
			Endereco endereco, String email, String senha) {
		super(nome, dataNascimento, idade, cpf, identidade, tel, endereco, email, senha);
		// TODO Auto-generated constructor stub
	}

	private Conta conta;

	private String cnh;

	private int quantidadeAssentos;

	private String licenca;

	private Turma turma;

}
