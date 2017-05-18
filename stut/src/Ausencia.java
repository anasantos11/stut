import java.time.LocalDate;
import java.util.ArrayList;

public class Ausencia {
	private LocalDate data;
	private String viagem;
	private String observacoes;
	private ArrayList listaAusencias;

	public void verificarAusencias() {

	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getViagem() {
		return viagem;
	}

	public void setViagem(String viagem) {
		this.viagem = viagem;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public ArrayList getListaAusencias() {
		return listaAusencias;
	}

	public void setListaAusencias(ArrayList listaAusencias) {
		this.listaAusencias = listaAusencias;
	}

}
