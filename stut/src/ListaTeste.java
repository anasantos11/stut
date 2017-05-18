import java.util.LinkedList;
import java.util.List;

public class ListaTeste {
	private List<Aluno> lista = new LinkedList<Aluno>();

	public void adicionar(Aluno a) {
		lista.add(a);
	}

	public int quantAluno() {
		return lista.size();
	}

}
