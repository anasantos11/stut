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

	
	public boolean temAssentos(){
		boolean sucess = false;
		if(turma.verificarAlunos().size() <= quantidadeAssentos){
			sucess = true;
		}
		return sucess;
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
