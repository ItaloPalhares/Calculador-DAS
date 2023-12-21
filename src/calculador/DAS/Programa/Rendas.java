package calculador.DAS.Programa;

import java.io.Serializable;
import java.util.List;

public class Rendas implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mes;
	private double valor;
	
	public Rendas(String mes, double valor) {
		this.mes = mes;
		this.valor = valor;
	}
	
	public Rendas(List<Rendas> lista) {
		// TODO Auto-generated constructor stub
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
		return this.mes +","+this.valor;
	}
	
}
