package it.magaz.model;

import java.util.List;

public class Autista extends Persona  {

	long id;
	List<Mezzo>listmezaut;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public List<Mezzo> getListmezaut() {
		return listmezaut;
	}
	public void setListmezaut(List<Mezzo> listmezaut) {
		this.listmezaut = listmezaut;
	}
	@Override
	public String toString() {
		return "Autista [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
	
	
}
