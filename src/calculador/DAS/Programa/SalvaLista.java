package calculador.DAS.Programa;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public abstract class SalvaLista {
	
	public static void salvarListaEmArquivo(String nomeArquivo, List<Rendas> lista) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(lista);
            System.out.println("Lista de Rendas salva em " + nomeArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}