package calculador.DAS.Programa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class LerLista{
	
	@SuppressWarnings("unchecked")
	static List<Rendas> arquivoParaLista(String nomeArquivo) throws IOException {
        List<Rendas> lista = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            lista = (List<Rendas>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
