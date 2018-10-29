package it.magaz.model;

public class Nave {
	
	long id;
	double pMax;
	String Marca;
	String nTelaio;
	double pTot;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getpMax() {
		return pMax;
	}
	public void setpMax(double pMax) {
		this.pMax = pMax;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getnTelaio() {
		return nTelaio;
	}
	public void setnTelaio(String nTelaio) {
		this.nTelaio = nTelaio;
	}
	public double getpTot() {
		return pTot;
	}
	public void setpTot(double pTot) {
		this.pTot = pTot;
	}
	
	
	public Nave(long id, double pMax, String marca, String nTelaio, double pTot) {
		super();
		this.id = id;
		this.pMax = pMax;
		Marca = marca;
		this.nTelaio = nTelaio;
		this.pTot = pTot;
	}
	
	
	public Nave() {
		super();
	}
	
	@Override
	public String toString() {
		return "Nave [id=" + id + ", pMax=" + pMax + ", Marca=" + Marca + ", nTelaio=" + nTelaio + ", pTot=" + pTot
				+ "]";
	}
	
	

}
