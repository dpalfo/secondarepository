package it.magaz.model;

import java.util.List;

public class Autista extends Persona  {

	long id;
	List<Mezzo<?>>listmezaut;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Mezzo<?>> getListmezaut() {
		return listmezaut;
	}
	public void setListmezaut(List<Mezzo<?>> listmezaut) {
		this.listmezaut = listmezaut;
	}
	
	
	public Autista(long id, List<Mezzo<?>> listmezaut) {
		super();
		this.id = id;
		this.listmezaut = listmezaut;
	}
	
	public Autista() {
		super();
	}
	@Override
	public String toString() {
		return "Autista [id=" + id + "]";
	}
	
	
	
}
