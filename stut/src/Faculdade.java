public class Faculdade {
	private String Nome;
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
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
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
}
