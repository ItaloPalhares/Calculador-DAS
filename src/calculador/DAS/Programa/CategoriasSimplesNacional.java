package calculador.DAS.Programa;

public abstract class CategoriasSimplesNacional {

	static double defineCategoria(double soma) {
		double DAS = 0;
		if (soma <= 180000.00) {
			System.out.println("utilizando faixa 01");
			double rendaBruta = soma;
			double aliquota = (4.5 / 100);
			double valorADescontar = (0);
			double aliquotaEfetiva = CalculadorSimplesNacional.calculadorSN(rendaBruta, aliquota, valorADescontar);
			DAS = CalculadorDAS.calculadorDAS(aliquotaEfetiva);
			return DAS;
		}

		if (soma >= 180000.01 && soma <= 360000.00) {
			System.out.println("utilizando faixa 02");
			double rendaBruta = soma;
			double aliquota = (9 / 100);
			double valorADescontar = (8100.00);
			double aliquotaEfetiva = CalculadorSimplesNacional.calculadorSN(rendaBruta, aliquota, valorADescontar);
			DAS = CalculadorDAS.calculadorDAS(aliquotaEfetiva);
			return DAS;
		}

		if (soma >= 360000.01 && soma <= 720000.00) {
			System.out.println("utilizando faixa 03");
			double rendaBruta = soma;
			double aliquota = (10.2 / 100);
			double valorADescontar = (12420.00);
			double aliquotaEfetiva = CalculadorSimplesNacional.calculadorSN(rendaBruta, aliquota, valorADescontar);
			DAS = CalculadorDAS.calculadorDAS(aliquotaEfetiva);
			return DAS;
		}

		if (soma >= 720000.01 && soma <= 1800000.00) {
			System.out.println("utilizando faixa 04");
			double rendaBruta = soma;
			double aliquota = (14 / 100);
			double valorADescontar = (39780.00);
			double aliquotaEfetiva = CalculadorSimplesNacional.calculadorSN(rendaBruta, aliquota, valorADescontar);
			DAS = CalculadorDAS.calculadorDAS(aliquotaEfetiva);
			return DAS;
		}

		if (soma >= 1800000.01 && soma <= 3600000.00) {
			System.out.println("utilizando faixa 05");
			double rendaBruta = soma;
			double aliquota = (22 / 100);
			double valorADescontar = (183780.00);
			double aliquotaEfetiva = CalculadorSimplesNacional.calculadorSN(rendaBruta, aliquota, valorADescontar);
			DAS = CalculadorDAS.calculadorDAS(aliquotaEfetiva);
			return DAS;
		}

		if (soma >= 3600000.01 && soma <= 4800000.00) {
			System.out.println("utilizando faixa 06");
			double rendaBruta = soma;
			double aliquota = (33 / 100);
			double valorADescontar = (828000.00);
			double aliquotaEfetiva = CalculadorSimplesNacional.calculadorSN(rendaBruta, aliquota, valorADescontar);
			DAS = CalculadorDAS.calculadorDAS(aliquotaEfetiva);
			return DAS;
		} else {
			DAS = 0;
		}
		return DAS;
	}

}
