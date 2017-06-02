import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Turma {
	private static int idTurma;
	private Motorista motorista;
	private final int quantAlunos = motorista.getQuantidadeAssentos();
	private Rota rota;
	private Viagem viagem;
	private List<Aluno> listaAluno;
	private List<String> listaBairro;
	private List<Faculdade> listaFaculdades;
	private int cont = 0;
	
	public Turma(Motorista motorista, Aluno aluno) {
		setMotorista(motorista);
		setRota(new Rota (this));
		setViagem(new Viagem(this, getRotaPadrao()));
		setListaAluno(new ArrayList<Aluno>());
		getListaAluno().add(aluno);
		setListaBairro( new ArrayList<String>());
	}
	
	/**
	 * Retorna os alunos cadastrados na turma
	 * @return
	 */

	public List<Aluno> getAlunosTurma() {
		return listaAluno;
	}
	/**
	 * Retorna a rota padrão da turma
	 */
	public Rota getRotaPadrao() {
		return rota;
	}

	public void setRota(Rota rota) {
		this.rota = rota;
	}	
	/**
	 *Verifica a rota do dia que a turma deverá fazer
	 * @return
	 */
	public String getRotaDia(){
		this.cont = 0;
		//Verifica se tem aluno ausente
		listaAluno.forEach(x -> {
			if(x.ehAusente()){
				this.cont++;
			}
		}); // se nao tiver ninguem ausente, pega rota padrao
		if(this.cont == 0){
			return rota.getRota();
		}else{
			TreeMap<LocalTime, Aluno> a = new TreeMap<LocalTime, Aluno>();
			listaAluno.forEach(x -> {
				a.put(x.getContratoAluno().getRecolhimentoCasa(), x);
			});
			return viagem.rotaAtualizadaPadraoJson(a);
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
	public List<String> getListaBairro() {
		return listaBairro;
	}
	public void setListaBairro(List<String> listaBairro) {
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
	public Viagem getViagem() {
		return viagem;
	}
	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}

}