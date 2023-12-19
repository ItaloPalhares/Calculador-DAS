package calculador.DAS.Programa;

public abstract class CalculadorSimplesNacional {

	public double calculadorSN(double rendaBruta, double aliquota, double valorDescontos) {
		double valorTotal = rendaBruta * aliquota;
		double valorFinal = valorTotal - valorDescontos;
	    System.out.println(valorFinal + " formatar dps");
	    double aliquotaEfetiva = valorFinal / rendaBruta;
	    System.out.println(aliquotaEfetiva);
	    return aliquotaEfetiva;
		
	}
}
