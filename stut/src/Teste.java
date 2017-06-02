import java.time.LocalDate;
import java.time.LocalTime;

public class Teste {
	public static void main(String args[]) {
		Endereco endMotorista = new Endereco("Avenida Bias Fortes", 160, "Carlos Prates", "Belo Horizonte", "MG",
				"30710045");
		Motorista sebastiao = new Motorista("Sebastião", LocalDate.of(1973, 02, 02), 44, "07887423655", "46587423",
				"31977554422", endMotorista, "m@teste.com", "m2256", null, null, 20, "5AS55A1SA51", null);

		Endereco endVinicius = new Endereco("Avenida Cisne", 160, "Lagoa dos Ingleses", "Belo Horizonte", "MG",
				"34018010");
		ContratoAluno conVinicius = new ContratoAluno("Cartão de crédito", "Semestral", "Volta",
				LocalDate.of(2017, 01, 01), LocalDate.of(2017, 07, 01), 50, "Ativo", LocalTime.of(18, 00),
				LocalTime.of(18, 00), LocalTime.of(18, 00), LocalTime.of(18, 00));
		Endereco endPuc = new Endereco("Claudio Manoel", 1205, "Funcionários", "Belo Horizonte", "MG", "30140108");
		Faculdade facul = new Faculdade("Puc Minas", endPuc);
		CartaoCredito cartaoVini = new CartaoCredito("341 - Itaú", "Mastercard", "3378554422116655", 447,
				LocalDate.of(2018, 01, 01));
		Aluno vinicius = new Aluno("Vinicius", LocalDate.of(1989, 01, 03), 28, "09525476889", "16478574",
				"031998758744", endVinicius, "v@teste.com", "v1234", null, conVinicius, facul, cartaoVini);

		Endereco aluno = new Endereco("Rua Joaquim Henriques Cardoso", 224, "Ouro Preto", "Belo Horizonte", "MG",
				"31320100");
		ContratoAluno conBruna = new ContratoAluno("Dinheiro", "Mensal", "Ida", LocalDate.of(2017, 02, 10),
				LocalDate.of(2017, 07, 20), 50, "Ativo", LocalTime.of(18, 30), LocalTime.of(22, 50),
				LocalTime.of(23, 30), LocalTime.of(19, 40));
		Aluno teste = new Aluno("Bruna", LocalDate.of(1999, 01, 01), 18, "5565656565", "5445453", "31988775544", aluno,
				"bruna@teste.com", "as54as", null, conBruna, facul, null);
		Turma stut = new Turma(sebastiao, vinicius);

	}

}
