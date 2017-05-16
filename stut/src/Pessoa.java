import java.time.LocalDate;

public abstract class Pessoa {

	private String nome;

	private LocalDate dataNascimento;

	private int idade;

	private String cpf;

	private String identidade;

	private String tel;

	private Endereco endereco;

	private String email;

	private String senha;

	private static  int idPessoa;

	private int cont;

	public int calcularIdade() {
		return 0;
	}

	public boolean ehMenor() {
		return false;
	}

	public boolean cpfEhValido() {
		return false;
	}

}
