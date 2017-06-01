import java.time.LocalDate;
import java.time.LocalTime;


public class Ausencia {
	private LocalDate data;
	private LocalTime hora;
	private String observacoes;
	
	public Ausencia(LocalDate data, LocalTime hora, String observacoes) {
		setData(data);
		setHora(hora);
		setObservacoes(observacoes);
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	

}
