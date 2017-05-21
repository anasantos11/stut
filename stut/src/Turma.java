import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Turma {
	private LinkedList<Aluno> listaAluno;
	private Motorista motorista;
	private Rota rota;
	private static int idTurma;
	private int cont = 0;

	public LinkedList<Aluno> verificarAlunos() {
		return listaAluno;
	}
	public void setListaAluno(LinkedList<Aluno> listaAluno) {
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

}