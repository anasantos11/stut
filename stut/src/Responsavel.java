import java.time.LocalDate;

public class Responsavel extends Pessoa {
	private Aluno responsavelAluno;

	public Responsavel(String nome, LocalDate dataNascimento, int idade, String cpf, String identidade, String tel,
			Endereco endereco, String email, String senha, Aluno aluno) {
		super(nome, dataNascimento, idade, cpf, identidade, tel, endereco, email, senha);
		setResponsavelAluno(aluno);
	}
	
	public Aluno getResponsavelAluno() {
		return responsavelAluno;
	}

	public void setResponsavelAluno(Aluno responsavelAluno) {
		this.responsavelAluno = responsavelAluno;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
