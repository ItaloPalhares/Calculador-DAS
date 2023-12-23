package calculador.DAS.Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class CalculadorDAS {
	
	
	private static double somarLista(List<Double> lista) {
		return lista.stream().mapToDouble(Double::doubleValue).sum();
	}

	 static double calculadorDAS(double aliquotaEfetiva) {
		Scanner input = new Scanner(System.in);
		List<Double> listaNfs = new ArrayList<Double>();
		System.out.println("Quantas NFs você deseja somar?");
		double totalNfs = input.nextDouble();
		System.out.println("serão somadas " + totalNfs+ " Nfs");
		for (int i = 1; i < totalNfs; i++) {
			System.out.print("Digite o valor da NF " + i + ": ");
			double notasFiscais = input.nextDouble();
			listaNfs.add(notasFiscais);
		}
		double DAS = aliquotaEfetiva * somarLista(listaNfs);
		input.close();
		return DAS;

	}

}
