package it.magaz.model;

import java.util.List;

public class Mezzo<T> {
	
	private T tipo;
	
	public Mezzo(T t) {
		
		tipo=t;
	}
	
	static int quantita;
	
	static List<Autista> autistiPerMezzo;
	
	static List<Merce<?>> merciPerMezzo;
	
	double pMax;

	public T getTipo() {
		return tipo;
	}

	public void setTipo(T tipo) {
		this.tipo = tipo;
	}

	public static int getQuantita() {
		return quantita;
	}

	public static void setQuantita(int quantita) {
		Mezzo.quantita = quantita;
	}

	public static List<Autista> getAutistiPerMezzo() {
		return autistiPerMezzo;
	}

	public void setAutistiPerMezzo(List<Autista> autistiPerMezzo) {
		Mezzo.autistiPerMezzo = autistiPerMezzo;
	}

	public List<Merce<?>> getMerciPerMezzo() {
		return merciPerMezzo;
	}

	public void setMerciPerMezzo(List<Merce<?>> merciPerMezzo) {
		Mezzo.merciPerMezzo = merciPerMezzo;
	}

	public double getpMax() {
		return pMax;
	}

	public void setpMax(double pMax) {
		this.pMax = pMax;
	}

	@Override
	public String toString() {
		return "Mezzo [tipo=" + tipo + ", pMax=" + pMax + "]";
	}
	
	
	
	

}
