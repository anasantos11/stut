import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;



public class Stut {
	private List<Aluno> clientes = new ArrayList<Aluno>();
	private List<Motorista> fornecedores = new LinkedList<Motorista>();
	private int j;
	private LinkedList<LinkedList<Aluno>> lb = new LinkedList<LinkedList<Aluno>>();
	private List<Turma> listaTurma = new ArrayList<Turma>();
	
	public LinkedList<LinkedList<Aluno>> getListBairrosXAuno() {
		return lb;
	}

	public void inserirCliente(Aluno a) {
		clientes.add(a);
	}

	public int quantCliente() {
		return clientes.size();
	}
	
	public void inserirFornecedor(Motorista m){
		fornecedores.add(m);
	}
	
	public int quantMotorista(){
		return fornecedores.size();
	}
	
	public Aluno consultarClientes(String cpf) {
		Aluno resp = null;
		Iterator<Aluno> iter = clientes.iterator();
		while(iter.hasNext()){
			Aluno alunoAtual = iter.next();
			System.out.println(alunoAtual.getCpf());
			if(alunoAtual.getCpf().equals(cpf)){
				resp = alunoAtual;
			}
		}			
		return resp;	
	}
	
	public Motorista consultarFornecedor(String cpf) {
		Motorista resp = null;
		Iterator<Motorista> iter = fornecedores.iterator();
		while(iter.hasNext()){
			Motorista motAtual = iter.next();
			if(motAtual.getCpf().equals(cpf)){
				resp = motAtual;
			}
		}			
		return resp;	
	}
	
	public Aluno consultarClientes2(int x) {
		return clientes.get(x);
	}
	
	public Motorista consultarFornecedor(int x) {
		return fornecedores.get(x);
	}
	
	public void inserirEmTurma(Aluno aluno) {
		if(listaTurma.size() != 0){
			listaTurma.forEach(y -> {
				boolean temEspaco = y.getMotorista().temAssentos();
				if(temEspaco){
					y.getAlunosTurma().add(aluno);
					y.getRota().ordenarRota(y);
				}
			});
		}else{
			fornecedores.forEach(x -> {
				if(x.temAssentos()){
					listaTurma.add(new Turma(x, aluno));
				}
			});
		}
	}

	public void alunoPorBairro(Aluno aluno){
		int i = lb.size();
		for (j = 0; j < i; j++) {
			lb.get(j).forEach(x -> {
				if(x.getEndereco().getBairro().equals(aluno.getEndereco().getBairro())){
					lb.get(j).add(aluno);
				}else if(j == (i-1)){
					LinkedList<Aluno> aux = new LinkedList<Aluno>();
					aux.add(aluno);
					lb.add(aux);
				}
			});
		}
	}
}
