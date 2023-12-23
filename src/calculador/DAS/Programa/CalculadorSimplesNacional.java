package calculador.DAS.Programa;

public abstract class CalculadorSimplesNacional {

	public static double calculadorSN(double rendaBruta, double aliquota, double valorDescontos) {
		double valorTotal = rendaBruta * aliquota;
		double valorFinal = valorTotal - valorDescontos;
		String valorFinalS = Formatar.formatarEmReais(valorFinal);
	    System.out.println("valor a ser dividido pela renda Bruta: " + valorFinalS);
	    double aliquotaEfetiva = valorFinal / rendaBruta;
	    String aliquotaEfetivaS = Formatar.formataAliquota(aliquotaEfetiva);
	    System.out.println("aliquota efetiva encontrada: " + aliquotaEfetivaS);
	    return aliquotaEfetiva;
		
	}
}
