import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends Pessoa {
	private String responsavel;
	private ContratoAluno contratoA;
	private Faculdade faculdade;
	private ContratoAluno contrato;
	private CartaoCredito cartao;
	//private Turma turma;
	private int turma;
	private int ausencias;
	private boolean ausente = false;
	private boolean temTurma = false;

	public Aluno(String nome, LocalDate dataNascimento, int idade,
			String cpf, String rg, String tel, Endereco endereco,
			String email, String senha, String responsavel, 
			ContratoAluno contrato, Faculdade facul, 
			CartaoCredito cartao) {
		
		
		super(nome, dataNascimento, idade, cpf, rg, tel, endereco, email, senha);
		setContratoAluno(contrato);
		setResponsavel(responsavel);
		setCartao(cartao);
		setFaculdade(facul);
		setAusencias(0);
	}

	// Para testar WebService
	public Aluno(String nome, LocalDate dataNascimento, int idade,
			String cpf, String rg, String tel, Endereco endAluno,
			String email, String senha, String responsavel2, 
			ContratoAluno contratoAluno, String faculdade2,String cartao2, String turma2) {
		
		
		super(nome, dataNascimento, idade, cpf, rg, tel, endAluno, email, senha);
		setContratoAluno(contratoAluno);
		setResponsavel(responsavel2);
		setAusencias(0);
	}

	public Faculdade getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(Faculdade faculdade) {
		this.faculdade = faculdade;
	}

	/**
	 * M�todos
	 */
	public void comunicarAusencia() {

	}

	public ArrayList verificarAusencias() {
		return null;
	}

	public ArrayList verificarViagens() {
		return null;
	}

	/**
	 * Getters e setters
	 */

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public ContratoAluno getContratoAluno() {
		return contratoA;
	}

	public void setContratoAluno(ContratoAluno contrato) {
		this.contratoA = contrato;
	}

	public ContratoAluno getContrato() {
		return contrato;
	}

	public void setContrato(ContratoAluno contrato) {
		this.contrato = contrato;
	}

	public CartaoCredito getCartao() {
		return cartao;
	}

	public void setCartao(CartaoCredito cartao) {
		this.cartao = cartao;
	}

	//public Turma getTurma() {
	//	return turma;
	//}
	
	public int getTurma() {
		return turma;
	}

	//public void setTurma(Turma turma) {
	//	this.turma = turma;
	//}
	
	public void setTurma(int turma) {
	this.turma = turma;
	}

	public int getAusencias() {
		return ausencias;
	}

	public void setAusencias(int ausencias) {
		this.ausencias = ausencias;
	}

	public boolean ehAusente() {
		return ausente;
	}

	public void setEhAusente(boolean ehAusente) {
		this.ausente = ehAusente;
	}

	public boolean temTurma() {
		return temTurma;
	}

	public void setTemTurma(boolean temTurma) {
		this.temTurma = temTurma;
	}

	@Override
	public String toString() {
		return super.toString() + " responsavel=" + responsavel + ", contrato=" + contratoA + ", faculdade=" + faculdade + ", cartao="
				+ cartao + ", turma=" + turma + ", ausencias=" + ausencias + "]";

	}

}
