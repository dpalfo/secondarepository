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
	public List<Operaio> aggiungiOperaio(Magazzino magazzino);
    public List<Mezzo<?>> aggiuingiMezzo(Magazzino magazzino);
	public List<Autista> aggiungiAutista(Magazzino magazzino);
	public List<Merce<?>> aggiungiMerce(List <Merce<?>> merce);
    public Merce<?> mercePiuTrasportata(List<Merce<?>> merci);
	public Mezzo<?> mezzoPiuPesante(List<Mezzo<?>> mezzi);
	public Mezzo<?> guadagnoMaggiore(List<Mezzo<?>> mezzi);
	public Autista autistaPiuMezzi(List<Autista>autisti);
	public List<Merce<?>> naveCamion(List<Merce<?>> merci);
	public void vediAutisti(Magazzino magazzino);
	public void vediMezzi (Magazzino magazzino);
	public void vediOperai(Magazzino magazzino);
	public void vediMerci(Magazzino magazzino);
	public void associaAutistaMezzo (Magazzino magazzino);
	public void associaOperaiMerci (Magazzino magazzino);
	public void associaMerciMezzi (Magazzino magazzino);
	
}
