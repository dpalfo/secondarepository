package it.magaz.services;

import java.util.List;

import it.magaz.model.Autista;
import it.magaz.model.Direttore;
import it.magaz.model.Magazzino;
import it.magaz.model.Merce;
import it.magaz.model.Mezzo;
import it.magaz.model.Operaio;

public interface DirettoreService {
	
    public Direttore creaDirettore (Direttore direttore);
	public List<Operaio> aggiungiOperaio(Operaio operaio);
	public Magazzino aggiuingiMezzo(Magazzino magazzino);
	public Magazzino aggiungiAutista(Magazzino magazzino);
	public Magazzino aggiungiMerce(Magazzino magazzino);
	public Merce<?> mercePiuTrasportata(List<Merce<?>> merci);
	public Mezzo<?> mezzoPiuPesante(List<Mezzo<?>> mezzi);
	public Mezzo<?> guadagnoMaggiore(List<Mezzo<?>> mezzi);
	public Autista autistaPiuMezzi(List<Autista>autisti);
	public List<Merce<?>> naveCamion(List<Merce<?>> merci);
	public void vediAutisti (Direttore direttore);
	
}
