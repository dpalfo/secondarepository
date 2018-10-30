package it.magaz.model;

import java.util.List;

public class Magazzino {
	
	List<Direttore> direttori;
	List<Operaio> operai;
	List<Merce<?>> merci;
	List<Mezzo<?>> mezzi;
	public List<Direttore> getDirettori() {
		return direttori;
	}
	public void setDirettori(List<Direttore> direttori) {
		this.direttori = direttori;
	}
	public List<Operaio> getOperai() {
		return operai;
	}
	public void setOperai(List<Operaio> operai) {
		this.operai = operai;
	}
	public List<Merce<?>> getMerci() {
		return merci;
	}
	public void setMerci(List<Merce<?>> merci) {
		this.merci = merci;
	}
	public List<Mezzo<?>> getMezzi() {
		return mezzi;
	}
	public void setMezzi(List<Mezzo<?>> mezzi) {
		this.mezzi = mezzi;
	}
	public Magazzino(List<Direttore> direttori, List<Operaio> operai, List<Merce<?>> merci, List<Mezzo<?>> mezzi) {
		super();
		this.direttori = direttori;
		this.operai = operai;
		this.merci = merci;
		this.mezzi = mezzi;
	}
	public Magazzino() {
		super();
	}
	@Override
	public String toString() {
		return "Magazzino [direttori=" + direttori + ", operai=" + operai + ", merci=" + merci + ", mezzi=" + mezzi
				+ "]";
	}
	
	

}
