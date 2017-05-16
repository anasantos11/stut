import java.util.ArrayList;

public class Aluno extends Pessoa {

	private String responsavel;

	private int contrato;

	private Faculdade faculdade;

	private CartaoCredito cartao;

	private Turma turma;

	private int ausencias;

	public void comunicarAusencia() {

	}

	public ArrayList verificarAusencias() {
		return null;
	}

	public ArrayList verificarViagens() {
		return null;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public int getContrato() {
		return contrato;
	}

	public void setContrato(int contrato) {
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
	
	

}
