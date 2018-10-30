package it.magaz.services;

import java.util.List;

import it.magaz.model.Autista;
import it.magaz.model.Direttore;
import it.magaz.model.Magazzino;
import it.magaz.model.Merce;
import it.magaz.model.Mezzo;
import it.magaz.model.Operaio;

public interface DirettoreService {
	
    public List<Direttore> creaDirettore (Magazzino magazzino);
	public List<Operaio> aggiungiOperaio(Magazzino magazzino);
    public List<Mezzo<?>> aggiuingiMezzo(Magazzino magazzino);
	public List<Autista> aggiungiAutista(Magazzino magazzino);
	public List<Merce<?>> aggiungiMerce(Magazzino magazzino);
    public Merce<?> mercePiuTrasportata(Magazzino magazzino);
	public Mezzo<?> mezzoPiuPesante(Magazzino magazzino);
	public Mezzo<?> guadagnoMaggiore(Magazzino magazzino);
	public Autista autistaPiuMezzi(Magazzino magazzino);
	public List<Merce<?>> naveCamion(Magazzino magazzino);
	public void vediAutisti(Magazzino magazzino);
	public void vediMezzi (Magazzino magazzino);
	public void vediOperai(Magazzino magazzino);
	public void vediMerci(Magazzino magazzino);
	public void associaAutistaMezzo (Magazzino magazzino);
	public void associaOperaiMerci (Magazzino magazzino);
	public void associaMerciMezzi (Magazzino magazzino);
	
}
