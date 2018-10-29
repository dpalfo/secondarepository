package it.magaz.serices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.magaz.model.Autista;
import it.magaz.model.Direttore;
import it.magaz.model.Merce;
import it.magaz.model.Mezzo;
import it.magaz.model.Nave;
import it.magaz.model.Operaio;

public class DirettoreServiceImpl implements DirettoreService {
	Scanner input=new Scanner(System.in);

	@Override
	public Direttore creaDirettore(Direttore direttore) {
		// TODO Auto-generated method stub
		System.out.println("inserisci un id");
		direttore.setId(input.nextLong());
		System.out.println("inserisci nome");
		direttore.setNome(input.nextLine());
		System.out.println("inserisci cognome");
		direttore.setCognome(input.nextLine());
		System.out.println("inserisci eta");
		direttore.setEta(input.nextInt());
		System.out.println("inserisci il codice direttore");
		direttore.setCodic(input.nextLine());
		return direttore;
	}

	@Override
	public List<Operaio> aggiungiOperaio(Operaio operaio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mezzo<?>> aggiuingiMezzo(Mezzo<?> mezzo) {
		// TODO Auto-generated method stub
		System.out.println("che mezzo vuoi aggiungere? 1)nave 2)camion");
		int x=input.nextInt();
		switch(x) {
		case 1:
			Mezzo<Nave> nave=new Mezzo<Nave>(new Nave());
			List<Autista> autisti=new ArrayList<Autista>();
			List<Merce<?>> merci=new ArrayList<Merce<?>>();
			System.out.println("inserisci id nave");
			nave.getTipo().setId(input.nextLong());
			System.out.println("inserisci il peso massimo che puo trasportare");
			nave.getTipo().setpMax(input.nextDouble());
			System.out.println("inserisci il numero di telaio");
			nave.getTipo().setnTelaio(input.nextLine());
			nave.setAutistiPerMezzo(autisti);
			nave.setMerciPerMezzo(merci);
			
			
		}
		return null;
	}

	@Override
	public List<Autista> aggiungiAutista(Autista autista) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Merce<?>> aggiungiMerce(Merce<?> merce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Merce<?> mercePiuTrasportata(List<Merce<?>> merci) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mezzo<?> mezzoPiuPesante(List<Mezzo<?>> mezzi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mezzo<?> guadagnoMaggiore(List<Mezzo<?>> mezzi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autista autistaPiuMezzi(List<Autista> autisti) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Merce<?> naveCamion(List<Merce<?>> merci) {
		// TODO Auto-generated method stub
		return null;
	}

}
