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
	private int cont = 0;	
	
	
	public Pessoa(String nome, LocalDate dataNascimento, int idade, String cpf, String identidade, String tel,
			Endereco endereco, String email, String senha) {
		setNome(nome);
		setDataNascimento(dataNascimento);
		setIdade(idade);
		setCpf(cpf);
		setIdentidade(identidade);
		setTel(tel);
		setEndereco(endereco);
		setEmail(email);
		setSenha(senha);
		idPessoa = cont++;
	}

	/**
	 * Métodos
	 */

	public int calcularIdade() {
		return 0;
	}

	public boolean ehMenor() {
		return false;
	}

	public boolean cpfEhValido() {
		return false;
	}
	
	
	/**
	 * Getters e setters
	 */
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static int getIdPessoa() {
		return idPessoa;
	}

	public static void setIdPessoa(int idPessoa) {
		Pessoa.idPessoa = idPessoa;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", idade=" + idade + ", cpf=" + cpf
				+ ", identidade=" + identidade + ", tel=" + tel + ", endereco=" + endereco + ", email=" + email
				+ ", senha=" + senha + "]";
	}
	
	
	

}
