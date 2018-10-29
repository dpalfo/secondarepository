package it.magaz.model;

public class MerceAbbigliamento {
	
	long id;
	double peso;
	double costo;
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
	@Override
	public String toString() {
		return "MerceCibo [id=" + id + ", peso=" + peso + ", costo=" + costo + "]";
	}
	

}
