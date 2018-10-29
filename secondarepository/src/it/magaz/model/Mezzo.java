package it.magaz.model;

import java.util.List;

public class Mezzo<T> {
	
	private T tipo;
	
	public Mezzo(T t) {
		
		tipo=t;
	}
	
	static int quantita;
	
	static List<Autista> autistiPerMezzo;
	
	static List<Merce> merciPerMezzo;
	

}
