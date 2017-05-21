import java.time.LocalDate;
import java.time.LocalTime;

public class ContratoAluno extends Contrato {
	private LocalTime recolhimentoCasa;
	private LocalTime recolhimentoFaculdade;
	private LocalTime entregaCasa;
	private LocalTime entregaFaculdade;

	public ContratoAluno(String formaPgto, String assinaturaPagto, String servico, LocalDate inicioContrato,
			LocalDate fimContrato, int percentualMulta, String status, LocalTime recolhimentoCasa,
			LocalTime recolhimentoFaculdade, LocalTime entregaCasa, LocalTime entregaFaculdade) {
		super(formaPgto, assinaturaPagto, servico, inicioContrato, fimContrato, percentualMulta, status);
		setRecolhimentoCasa(recolhimentoCasa);
		setRecolhimentoFaculdade(recolhimentoFaculdade);
		setEntregaCasa(entregaCasa);
		setEntregaFaculdade(entregaFaculdade);
	}

	public ContratoAluno(String formaPgto, String assinaturaPagto, String servico, LocalDate inicioContrato,
			LocalDate fimContrato, int percentualMulta, String status) {
		super(formaPgto, assinaturaPagto, servico, inicioContrato, fimContrato, percentualMulta, status);
	}

	public void multaAluno() {

	}

	public void encerrarAluno() {

	}

	public void renovarAluno() {

	}

	public LocalTime getRecolhimentoCasa() {
		return recolhimentoCasa;
	}

	public void setRecolhimentoCasa(LocalTime recolhimentoCasa) {
		this.recolhimentoCasa = recolhimentoCasa;
	}

	public LocalTime getRecolhimentoFaculdade() {
		return recolhimentoFaculdade;
	}

	public void setRecolhimentoFaculdade(LocalTime recolhimentoFaculdade) {
		this.recolhimentoFaculdade = recolhimentoFaculdade;
	}

	public LocalTime getEntregaCasa() {
		return entregaCasa;
	}

	public void setEntregaCasa(LocalTime entregaCasa) {
		this.entregaCasa = entregaCasa;
	}

	public LocalTime getEntregaFaculdade() {
		return entregaFaculdade;
	}

	public void setEntregaFaculdade(LocalTime entregaFaculdade) {
		this.entregaFaculdade = entregaFaculdade;
	}
}
