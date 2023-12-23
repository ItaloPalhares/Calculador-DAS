package calculador.DAS.Programa;

import java.text.DecimalFormat;

public abstract class Formatar {
	
	static String formatarEmReais(double valor) {
		DecimalFormat formatoReais = new DecimalFormat("R$ #,##0.00");
		return formatoReais.format(valor);
	}
	static String formataAliquota(double valor) {
		DecimalFormat formatoAliquota = new DecimalFormat("#0.00");
		return formatoAliquota.format(valor);
	

}
}
