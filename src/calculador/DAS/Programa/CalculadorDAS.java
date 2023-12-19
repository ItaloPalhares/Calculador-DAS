package calculador.DAS.Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class CalculadorDAS {
	
	
	private static double somarLista(List<Double> lista) {
		return lista.stream().mapToDouble(Double::doubleValue).sum();
	}

	public double calculadorDAS(double aliquotaEfetiva) {
		Scanner input = new Scanner(System.in);
		List<Double> listaNfs = new ArrayList<Double>();
		double totalNfs = input.nextDouble();
		for (int i = 0; i < totalNfs; i++) {
			System.out.print("Digite o valor da NF " + i + ": ");
			double notasFiscais = input.nextDouble();
			listaNfs.add(notasFiscais);
		}
		double DAS = aliquotaEfetiva * somarLista(listaNfs);
		input.close();
		return DAS;

	}

}
