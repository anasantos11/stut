public class Faculdade {
	private String faculdade;
	private Endereco endereco;
	private static  int idFacul;
	private int cont = 0;
	
	public Faculdade(String nome, Endereco endereco) {
		setNome(nome);
		setEndereco(endereco);
		idFacul = cont ++;
	}

	/**
	 * Getters e setters
	 */
	
	public String getNome() {
		return faculdade;
	}
	public void setNome(String nome) {
		faculdade = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public static int getIdFacul() {
		return idFacul;
	}

	@Override
	public String toString() {
		return "\nFaculdade: " + faculdade + "\nEndereco Faculdade: " + endereco.toString();
	}
	
	
}
