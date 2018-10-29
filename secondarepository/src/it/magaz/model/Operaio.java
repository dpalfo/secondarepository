package it.magaz.model;

public class Operaio extends Persona  {

	long id;
	Merce merce;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Merce getMerce() {
		return merce;
	}
	public void setMerce(Merce merce) {
		this.merce = merce;
	}
	
	@Override
	public String toString() {
		return "Operaio [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
	
}
