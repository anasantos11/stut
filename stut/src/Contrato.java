import java.time.LocalDate;

public abstract class Contrato {
	private String formaPgto;
	private String assinaturaPagto;
	private String servico;
	private LocalDate inicioContrato;
	private LocalDate fimContrato;
	private int percentualMulta;
	//private StatusContrato status;
	private String status;
	
	public Contrato(String formaPgto, String assinaturaPagto, String servico, LocalDate inicioContrato,
			LocalDate fimContrato, int percentualMulta, String status) {

		setFormaPgto(formaPgto);
		setAssinaturaPagto(assinaturaPagto);
		setFormaPgto(formaPgto);
		setAssinaturaPagto(assinaturaPagto);
		setServico(servico);
		setInicioContrato(inicioContrato);
		setFimContrato(fimContrato);
		setPercentualMulta(percentualMulta);
		setStatus(status);

	}

	/**
	 * Métodos
	 */
	public void MultaMotorista() {

	}

	public void encerrarMotorista() {

	}

	public void renovarMotorista() {

	}

	public void multaAluno() {

	}

	public void encerrarAluno() {

	}

	public void renovarAluno() {

	}
	

	/**
	 * Getters e setters
	 */
	public String getFormaPgto() {
		return formaPgto;
	}

	public void setFormaPgto(String formaPgto) {
		this.formaPgto = formaPgto;
	}

	public String getAssinaturaPagto() {
		return assinaturaPagto;
	}

	public void setAssinaturaPagto(String assinaturaPagto) {
		this.assinaturaPagto = assinaturaPagto;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public LocalDate getInicioContrato() {
		return inicioContrato;
	}

	public void setInicioContrato(LocalDate inicioContrato) {
		this.inicioContrato = inicioContrato;
	}

	public LocalDate getFimContrato() {
		return fimContrato;
	}

	public void setFimContrato(LocalDate fimContrato) {
		this.fimContrato = fimContrato;
	}

	public int getPercentualMulta() {
		return percentualMulta;
	}

	public void setPercentualMulta(int percentualMulta) {
		this.percentualMulta = percentualMulta;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "\nformaPgto: " + formaPgto + "\nAssinatura Pagto :" + assinaturaPagto + "\nServico: " + servico
				+ "\nInicio Contrato: " + inicioContrato + "\n Fim Contrato: " + fimContrato + "\n Percentual Multa: "
				+ percentualMulta + "\nStatus: " + status;
	}
	

}
