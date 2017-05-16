import java.time.LocalDate;

public abstract class Contrato {

	private String formaPgto;

	private String assinaturaPagto;

	private String servico;

	private LocalDate inicioContrato;

	private LocalDate fimContrato;

	private int percentualMulta;

	private StatusContrato status;

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

}
