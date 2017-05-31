import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Turma {
	private static int idTurma;
	private Motorista motorista;
	private final int quantAlunos = motorista.getQuantidadeAssentos();
	private Rota rota;
	private List<Aluno> listaAluno;
	private List<Endereco> listaBairro;
	private List<Faculdade> listaFaculdades;
	private int cont = 0;

	public List<Aluno> verificarAlunos() {
		return listaAluno;
	}
	public void verificarRota() {
		this.rota.getRotaPadrao();
	}
	
	public void ordenarRota(){
		TreeMap<LocalTime, Aluno> a = new TreeMap<LocalTime, Aluno>();
		listaAluno.forEach(x -> {
			a.put(x.getContratoAluno().getRecolhimentoCasa(), x);
		});
		rota.rotaOrdenadaPadraoJson(a);
	}
	
	public String getRotaDia(){
		this.cont = 0;
		listaAluno.forEach(x -> {
			if(x.ehAusente()){
				this.cont++;
			}
		});
		if(this.cont == 0){
			return rota.getRotaPadrao();
		}else{
			TreeMap<LocalTime, Aluno> a = new TreeMap<LocalTime, Aluno>();
			listaAluno.forEach(x -> {
				a.put(x.getContratoAluno().getRecolhimentoCasa(), x);
			});
			return rota.rotaAtualizadaPadraoJson(a);
		}
	}
	
	public void setListaAluno(List<Aluno> listaAluno) {
		this.listaAluno = listaAluno;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public Rota getRota() {
		return rota;
	}
	public void setRota(Rota rota) {
		this.rota = rota;
	}
	public static int getIdTurma() {
		return idTurma;
	}
	public static void setIdTurma(int idTurma) {
		Turma.idTurma = idTurma;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	public List<Endereco> getListaBairro() {
		return listaBairro;
	}
	public void setListaBairro(List<Endereco> listaBairro) {
		this.listaBairro = listaBairro;
	}
	public List<Faculdade> getListaFaculdades() {
		return listaFaculdades;
	}
	public void setListaFaculdades(List<Faculdade> listaFaculdades) {
		this.listaFaculdades = listaFaculdades;
	}
	public int getQuantAlunos() {
		return quantAlunos;
	}
	public List<Aluno> getListaAluno() {
		return listaAluno;
	}

}