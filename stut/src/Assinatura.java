
public enum Assinatura {
	;
	private String MENSAL;
	private String TRIMESTRAL;
	private String SEMESTRAL;
	private String ANUAL;

	public enum AssinaturaEnum {
		MENSAL(1), TRIMESTRAL(3), SEMESTRAL(6), ANUAL(12);

		public int quantMeses;

		AssinaturaEnum(int valor) {
			quantMeses = valor;
		}
	}

}
