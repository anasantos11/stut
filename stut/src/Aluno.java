import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends Pessoa {
	private String responsavel;
	private Contrato contrato;
	private Faculdade faculdade;
	private CartaoCredito cartao;
	private Turma turma;
	private int ausencias;



	public Aluno(String nome, LocalDate dataNascimento, int idade, String cpf, String rg, String tel, Endereco endereco,
			String email, String senha, String responsavel, ContratoAluno contrato, Faculdade facul,
			CartaoCredito cartao, Turma turma) {
		super(nome, dataNascimento, idade, cpf, rg, tel, endereco, email, senha);
		setContrato(contrato);
		setResponsavel(responsavel);
		setFaculdade(facul);
		setCartao(cartao);
		setTurma(turma);
		setAusencias(0);
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


	public Contrato getContrato() {
		return contrato;
	}


	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}


	public Faculdade getFaculdade() {
		return faculdade;
	}


	public void setFaculdade(Faculdade faculdade) {
		this.faculdade = faculdade;
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


	public int getAusencias() {
		return ausencias;
	}


	public void setAusencias(int ausencias) {
		this.ausencias = ausencias;
	}


	@Override
	public String toString() {
		return super.toString() + " responsavel=" + responsavel + ", contrato=" + contrato + ", faculdade=" + faculdade + ", cartao="
				+ cartao + ", turma=" + turma + ", ausencias=" + ausencias + "]";
	}

	


}
