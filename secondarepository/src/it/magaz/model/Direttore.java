package it.magaz.model;

import java.util.List;

public class Direttore extends Persona {

	long id;
	String codic;
	List<Autista> listaAutisti;
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
	
	public List<Autista> getListaAutisti() {
		return listaAutisti;
	}
	public void setListaAutisti(List<Autista> listaAutisti) {
		this.listaAutisti = listaAutisti;
	}
	public Direttore() {
		super();
	}
	
	
	

	public Direttore(long id, String codic, List<Autista> listaAutisti) {
		super();
		this.id = id;
		this.codic = codic;
		this.listaAutisti = listaAutisti;
	}
	@Override
	public String toString() {
		return "Direttore [id=" + id + ", codic=" + codic + ", listaAutisti=" + listaAutisti + ", nome=" + nome
				+ ", cognome=" + cognome + "]";
	}
	
}
