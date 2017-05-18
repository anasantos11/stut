import java.time.LocalDate;

public class ContratoMotorista extends Contrato {
	private String placaVeiculo;
	private String modeloVeiculo;
	private String anoVeiculo;
	
	public ContratoMotorista(String formaPgto, String assinaturaPagto, String servico, LocalDate inicioContrato,
			LocalDate fimContrato, int percentualMulta, String status) {
		super(formaPgto, assinaturaPagto, servico, inicioContrato, fimContrato, percentualMulta, status);

		
	}

	/*public ContratoMotorista(String formaPgto, String assinaturaPagto, String servico, LocalDate inicioContrato,
			LocalDate fimContrato, int percentualMulta, StatusContrato status) {

		super(formaPgto, assinaturaPagto, servico, inicioContrato, fimContrato, percentualMulta, status);
		setPlacaVeiculo(placaVeiculo);
		setModeloVeiculo(modeloVeiculo);
		setAnoVeiculo(anoVeiculo);
	}*/

	/**
	 * Métodos
	 */
	public void MultaMotorista() {

	}

	public void encerrarMotorista() {

	}

	public void renovarMotorista() {

	}

	/**
	 * Getters e setters
	 */

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public String getAnoVeiculo() {
		return anoVeiculo;
	}

	public void setAnoVeiculo(String anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}

}
