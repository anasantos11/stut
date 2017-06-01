import java.time.LocalDate;

public class CartaoCredito {
	private String banco;
	private String bandeiraCartao;
	private String numCartao;
	private int codigoCartao;
	private LocalDate dataValidade;

	public CartaoCredito(String banco, String bandeiraCartao, String numCartao, int codigoCartao,
			LocalDate dataValidade) {
		setBanco(banco);
		setBandeiraCartao(bandeiraCartao);
		setNumCartao(numCartao);
		setCodigoCartao(codigoCartao);
		setDataValidade(dataValidade);
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getBandeiraCartao() {
		return bandeiraCartao;
	}

	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public int getCodigoCartao() {
		return codigoCartao;
	}

	public void setCodigoCartao(int codigoCartao) {
		this.codigoCartao = codigoCartao;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public String toString() {
		return "\nBanco: " + banco + "\nBandeira: " + bandeiraCartao + "\nNúmero Cartão: " + numCartao
				+ "\nCodigo Cartao: " + codigoCartao + "\nData Validade: " + dataValidade;
	}

}
