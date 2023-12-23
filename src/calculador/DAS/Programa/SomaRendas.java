package calculador.DAS.Programa;

import java.util.List;

public abstract class SomaRendas {

	static double somar(List<Rendas> lista) {
		int tamanhoDaLista = lista.size();
		int inicio = Math.max(0, tamanhoDaLista - 12);
		int fim = tamanhoDaLista;
		double soma = 0.0;
		for (int i = inicio; i<fim; i++) {
			soma += lista.get(i).getValor();
		}
		return soma;
	}
}
