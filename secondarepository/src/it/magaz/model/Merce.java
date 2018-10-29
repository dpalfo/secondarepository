package it.magaz.model;


import java.util.List;

public class Merce<T> {
	
	private T contenuto;
	
	public Merce(T t) {
		
		contenuto=t;
	}
	
	static int quantita;

	static List<Mezzo<?>> mezziMerce;
	
	static List<Operaio> operaiMerce;
	
	double costo;
	
	double peso;
	
	Destinazione destinazione;

	public T getContenuto() {
		return contenuto;
	}

	public void setContenuto(T contenuto) {
		this.contenuto = contenuto;
	}

	public static int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		Merce.quantita = quantita;
	}

	

	public List<Mezzo<?>> getMezziMerce() {
		return mezziMerce;
	}

	public void setMezziMerce(List<Mezzo<?>> mezziMerce) {
		Merce.mezziMerce = mezziMerce;
	}

	public static List<Operaio> getOperaiMerce() {
		return operaiMerce;
	}

	public void setOperaiMerce(List<Operaio> operaiMerce) {
		Merce.operaiMerce = operaiMerce;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public Destinazione getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(Destinazione destinazione) {
		this.destinazione = destinazione;
	}
	
	

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Merce [contenuto=" + contenuto + ", costo=" + costo + ", peso=" + peso + ", destinazione="
				+ destinazione + "]";
	}

	
	
	
}
