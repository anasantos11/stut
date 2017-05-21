import java.time.LocalDate;

public class Motorista extends Pessoa {
	private Conta conta;
	private String cnh;
	private int quantidadeAssentos;
	private String licenca;
	private Turma turma;

	public Motorista(String nome, LocalDate dataNascimento, int idade, String cpf, String identidade, String tel,
			Endereco endereco, String email, String senha, Conta conta, String cnh, int quantAssentos, String licenca,
			Turma turma) {
		super(nome, dataNascimento, idade, cpf, identidade, tel, endereco, email, senha);
		setConta(conta);
		setCnh(cnh);
		setQuantidadeAssentos(quantAssentos);
		setLicenca(licenca);
		setTurma(turma);
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public int getQuantidadeAssentos() {
		return quantidadeAssentos;
	}

	public void setQuantidadeAssentos(int quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}

	public String getLicenca() {
		return licenca;
	}

	public void setLicenca(String licenca) {
		this.licenca = licenca;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
