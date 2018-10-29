package it.magaz.model;

public class Operaio extends Persona  {

	long id;
	Merce<?> merce;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Merce<?> getMerce() {
		return merce;
	}
	public void setMerce(Merce<?> merce) {
		this.merce = merce;
	}
	public Operaio(long id, Merce<?> merce) {
		super();
		this.id = id;
		this.merce = merce;
	}
	public Operaio() {
		super();
	}
	@Override
	public String toString() {
		return "Operaio [id=" + id + ", merce=" + merce + "]";
	}
	
	
	
	
}
