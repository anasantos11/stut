import java.time.LocalDate;

public class CartaoCredito {
	private int banco;
	private int bandeiraCartao;
	private int numCartao;
	private int codigoCartao;
	private LocalDate dataValidade;
	
	public CartaoCredito(int banco, int bandeiraCartao, int numCartao, int codigoCartao, LocalDate dataValidade) {
		setBanco(banco);
		setBandeiraCartao(bandeiraCartao);
		setNumCartao(numCartao);
		setCodigoCartao(codigoCartao);
		setDataValidade(dataValidade);
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public int getBandeiraCartao() {
		return bandeiraCartao;
	}

	public void setBandeiraCartao(int bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}

	public int getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(int numCartao) {
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

}
