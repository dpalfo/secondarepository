package it.magaz.model;

public class Direttore extends Persona {

	long id;
	String codic;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCodic() {
		return codic;
	}
	public void setCodic(String codic) {
		this.codic = codic;
	}
	
	
	public Direttore(long id, String codic) {
		super();
		this.id = id;
		this.codic = codic;
	}
	
	
	public Direttore() {
		super();
	}
	@Override
	public String toString() {
		return "Direttore [id=" + id + ", codic=" + codic + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta
				+ "]";
	}
	
	
	
}
