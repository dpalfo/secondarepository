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
	
	@Override
	public String toString() {
		return "Direttore [id=" + id + ", codic=" + codic + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta
				+ "]";
	}
	
	
	
}
