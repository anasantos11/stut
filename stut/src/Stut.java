import java.util.LinkedList;
import java.util.List;

public class Stut {
	private List<Aluno> clientes = new LinkedList<Aluno>();
	private List<Motorista> fornecedores = new LinkedList<Motorista>();
	
	
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
	
	public Aluno consultarClientes() {
		return clientes.get(0);
	}
	
	

}
