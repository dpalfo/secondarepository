package it.magaz.model;

public class MerceAbbigliamento {
	
	long id;
	double peso;
	double costo;
	Destinazione destinazione;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
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
	public MerceAbbigliamento(long id, double peso, double costo, Destinazione destinazione) {
		super();
		this.id = id;
		this.peso = peso;
		this.costo = costo;
		this.destinazione = destinazione;
	}
	public MerceAbbigliamento() {
		super();
	}
	@Override
	public String toString() {
		return "MerceAbbigliamento [id=" + id + ", peso=" + peso + ", costo=" + costo + ", destinazione=" + destinazione
				+ "]";
	}
	
	

}
