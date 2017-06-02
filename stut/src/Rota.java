import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public  class Rota {
	private String rota;

	public Rota(Turma turma){
		setRota(ordenarRota(turma));
	}
	public String ordenarRota( Turma turma){
		TreeMap<LocalTime, Aluno> a = new TreeMap<LocalTime, Aluno>();
		turma.getListaAluno().forEach(x -> {
			a.put(x.getContratoAluno().getRecolhimentoCasa(), x);
		});
		return rotaOrdenadaPadraoJson(a);
	}
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	
	
	/**
	 * Atualiza rota após novo aluno ser inserido na turma
	 * @param a
	 */
	public String rotaOrdenadaPadraoJson(TreeMap<LocalTime, Aluno> a){
		String jsonAlunos = "{Alunos : {";
		for (Map.Entry<LocalTime, Aluno> x : a.entrySet()){
			jsonAlunos += "[{\"nome :\" \" " + x.getValue().getNome() + "\"," +
					"\"tel :\" \" " + x.getValue().getTel() + "\"," +
					"\"ruaAl\" : \" " + x.getValue().getEndereco().getRua() + "\"," +
					"\"bairroAl\" : \" " + x.getValue().getEndereco().getBairro() + "\"," +
					"\"numeroEndAl\" : \" " + x.getValue().getEndereco().getNumero() + "\"," +
					"\"cepAl\" : \" " + x.getValue().getEndereco().getCep() + "\"," +
					"\"nomeFac\" : \" " + x.getValue().getFaculdade().getNome() + "\"," +
					"\"ruaFac\" : \" " + x.getValue().getFaculdade().getEndereco().getRua() + "\"," +
					"\"bairroFac\" : \" " + x.getValue().getFaculdade().getEndereco().getBairro() + "\"," +
					"\"numeorEndFac\" : \" " + x.getValue().getFaculdade().getEndereco().getNumero() + "\"," +
					"\"cepFac\" : \" " + x.getValue().getFaculdade().getEndereco().getCep() + "\"}],";
		}
		jsonAlunos += "[]}}";
		return jsonAlunos;
	}

	

}
