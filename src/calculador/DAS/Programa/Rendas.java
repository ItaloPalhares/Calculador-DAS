package calculador.DAS.Programa;

public class Rendas {
	
	private String mes;
	private double valor;
	
	public Rendas(String mes, double valor) {
		this.mes = mes;
		this.valor = valor;
	}
	
	public String getMes() {
		return mes;
	}
	public double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "mês: " + this.mes + " valor: " + this.valor;
	}
	
}
