package it.magaz.model;

public class Destinazione {

	long id;
	String nome;
	Mezzo mezzo;
	Merce merce;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Mezzo getMezzo() {
		return mezzo;
	}
	public void setMezzo(Mezzo mezzo) {
		this.mezzo = mezzo;
	}
	
	public Merce getMerce() {
		return merce;
	}
	public void setMerce(Merce merce) {
		this.merce = merce;
	}
	
	@Override
	public String toString() {
		return "Destinazione [id=" + id + ", nome=" + nome + "]";
	}
	
	
}
