import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	private String responsavel;
	private ContratoAluno contratoA;
	private Faculdade faculdade;
	private CartaoCredito cartao;
	private Turma turma;
	private List<Ausencia> ausencias;
	private boolean ausente = false;
	private boolean temTurma = false;

	public Aluno(String nome, LocalDate dataNascimento, int idade, String cpf, String rg, String tel, Endereco endereco,
			String email, String senha, String responsavel, ContratoAluno contrato, Faculdade facul,
			CartaoCredito cartao) {
		super(nome, dataNascimento, idade, cpf, rg, tel, endereco, email, senha);
		setContratoAluno(contrato);
		setResponsavel(responsavel);
		setCartao(cartao);
		setFaculdade(facul);
	}






	/**
	 * Métodos
	 */
	public void comunicarAusencia(LocalDate data,  LocalTime hora, String observacoes) {
		Ausencia a = new Ausencia(data, hora, observacoes);
		ausencias.add(a);
	}
	
	public ArrayList verificarViagens() {
		return null;
	}

	/**
	 * Getters e setters
	 */
	
	public Faculdade getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(Faculdade faculdade) {
		this.faculdade = faculdade;
	}

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

	public CartaoCredito getCartao() {
		return cartao;
	}

	public void setCartao(CartaoCredito cartao) {
		this.cartao = cartao;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}


	public List<Ausencia> getAusencias() {
		return ausencias;
	}

	public void setAusencias(List<Ausencia> ausencias) {
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
		return super.toString() + "\nResponsavel: " + responsavel.toString() + "\nContrato: " + contratoA.toString() + "\nFaculdade=" + faculdade.toString() 
				+ "\nCartao:" + cartao.toString() + "\nTurma:" + turma.toString() + "\nAusencias=" + ausencias.toString();

	}

}
