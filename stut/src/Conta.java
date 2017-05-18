public class Conta {

	private int banco;

	private int agencia;

	private int numConta;

	private int operacao;

	private String tipo;
	
		
	public Conta(int banco, int agencia, int numConta, int operacao, String tipo) {
		setBanco(banco);
		setAgencia(agencia);
		setNumConta(numConta);
		setOperacao(operacao);
		setTipo(tipo);
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getOperacao() {
		return operacao;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
