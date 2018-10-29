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

	

	public static List<Mezzo<?>> getMezziMerce() {
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

	@Override
	public String toString() {
		return "Merce [contenuto=" + contenuto + ", costo=" + costo + ", destinazione=" + destinazione + "]";
	}

	
	
}
