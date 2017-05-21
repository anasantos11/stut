import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends Pessoa {
	private String responsavel;
	private ContratoAluno contrato;
	// private Faculdade faculdade;
	private String faculdade;
	private CartaoCredito cartao;
	// private Turma turma;
	private int turma;
	private int ausencias;

	public Aluno(String nome, LocalDate dataNascimento, int idade, String cpf, String rg, String tel, Endereco endereco,
			String email, String senha, String responsavel, ContratoAluno contrato, String facul, CartaoCredito cartao,
			int turma) {
		super(nome, dataNascimento, idade, cpf, rg, tel, endereco, email, senha);
		setContrato(contrato);
		setResponsavel(responsavel);
		setFaculdade(facul);
		setCartao(cartao);
		setTurma(turma);
		setAusencias(0);
	}

	/**
	 * Métodos
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

	public ContratoAluno getContrato() {
		return contrato;
	}

	public void setContrato(ContratoAluno contrato) {
		this.contrato = contrato;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public CartaoCredito getCartao() {
		return cartao;
	}

	public void setCartao(CartaoCredito cartao) {
		this.cartao = cartao;
	}

	public int getTurma() {
		return turma;
	}

	public void setTurma(int turma) {
		this.turma = turma;
	}

	public int getAusencias() {
		return ausencias;
	}

	public void setAusencias(int ausencias) {
		this.ausencias = ausencias;
	}

	@Override
	public String toString() {
		return super.toString() + " responsavel: " + responsavel + contrato.toString() + ", faculdade:" + faculdade
				+ cartao.toString() + ", turma: " + turma + ", ausencias: " + ausencias;
	}

}
