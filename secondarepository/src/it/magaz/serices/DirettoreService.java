package it.magaz.serices;

import java.util.List;

import it.magaz.model.Autista;
import it.magaz.model.Direttore;
import it.magaz.model.Merce;
import it.magaz.model.Mezzo;
import it.magaz.model.Operaio;

public interface DirettoreService {
	
    public Direttore creaDirettore (Direttore direttore);
	public Operaio aggiungiOperaio(Operaio operaio);
	public Mezzo<?> aggiingiMezzo(Mezzo<?>mezzo);
	public Autista aggiungiAutista(Autista autista);
	public Merce<?> aggiungiMerce(Merce<?> merce);
	public Merce<?> mercePiuTrasportata(List<Merce<?>> merci);
	public Mezzo<?> mezzoPiuPesante(List<Mezzo<?>> mezzi);
	public Mezzo<?> guadagnoMaggiore(List<Mezzo<?>> mezzi);
	public Autista autistaPiuMezzi(List<Autista>autisti);
	public Merce<?> naveCamion(List<Merce<?>> merci);
}
