package it.magaz.model;

import java.util.List;

public class Destinazione {

	long id;
	String nome;
	List<Mezzo<?>> mezziDestinazione;
	List<Merce<?>> merciDestinazione;
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
	public List<Mezzo<?>> getMezziDestinazione() {
		return mezziDestinazione;
	}
	public void setMezziDestinazione(List<Mezzo<?>> mezziDestinazione) {
		this.mezziDestinazione = mezziDestinazione;
	}
	public List<Merce<?>> getMerciDestinazione() {
		return merciDestinazione;
	}
	public void setMerciDestinazione(List<Merce<?>> merciDestinazione) {
		this.merciDestinazione = merciDestinazione;
	}
	
	
	public Destinazione(long id, String nome, List<Mezzo<?>> mezziDestinazione, List<Merce<?>> merciDestinazione) {
		super();
		this.id = id;
		this.nome = nome;
		this.mezziDestinazione = mezziDestinazione;
		this.merciDestinazione = merciDestinazione;
	}
	
	
	public Destinazione() {
		super();
	}
	@Override
	public String toString() {
		return "Destinazione [id=" + id + ", nome=" + nome + ", mezziDestinazione=" + mezziDestinazione
				+ ", merciDestinazione=" + merciDestinazione + "]";
	}
	
	
	
}
