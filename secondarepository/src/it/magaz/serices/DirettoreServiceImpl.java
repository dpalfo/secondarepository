package it.magaz.serices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.magaz.model.Autista;
import it.magaz.model.Camion;
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
		System.out.println("Crea operaio");
		System.out.println("Inserisci l'ID dell'operaio: ");
		operaio.setId(input.nextLong());
		System.out.println("Inserisci il nome: ");
		operaio.setNome(input.nextLine());
		System.out.println("Inserisci il cognome: ");
		operaio.setCognome(input.nextLine());
		System.out.println("Inserisci l' eta: ");
		operaio.setEta(input.nextInt());
		List<Operaio>oper=new ArrayList<Operaio>();
		oper.add(operaio);
		return oper;
	}

	@Override
	public List<Mezzo<?>> aggiuingiMezzo(List<Mezzo<?>> mezzo) {
		// TODO Auto-generated method stub
		System.out.println("che mezzo vuoi aggiungere? 1)nave 2)camion");
		int x=input.nextInt();
		switch(x) {
		case 1:
			Mezzo<Nave> nave=new Mezzo<Nave>(new Nave());
			List<Autista> autistiNave=new ArrayList<Autista>();
			List<Merce<?>> merciNave=new ArrayList<Merce<?>>();
			System.out.println("inserisci id nave");
			nave.getTipo().setId(input.nextLong());
			System.out.println("inserisci il peso massimo che puo trasportare");
			nave.getTipo().setpMax(input.nextDouble());
			System.out.println("inserisci il numero di telaio");
			nave.getTipo().setnTelaio(input.nextLine());
			nave.getTipo().setpTot(0);
			nave.setAutistiPerMezzo(autistiNave);
			nave.setMerciPerMezzo(merciNave);
			mezzo.add(nave);
			break;
		case 2:
			Mezzo<Camion> camion=new Mezzo<Camion>(new Camion());
			List <Autista> autistiCamion=new ArrayList<Autista>();
			List<Merce<?>> merciCamion=new ArrayList<Merce<?>>();
			System.out.println("inserisci id camion");
			camion.getTipo().setId(input.nextLong());
			System.out.println("inserisci il peso massimo che puo trasportare");
			camion.getTipo().setpMax(input.nextDouble());
			System.out.println("inserisci il numero di telaio");
			camion.getTipo().setnTelaio(input.nextLine());
			camion.getTipo().setpTot(0);
			camion.setAutistiPerMezzo(autistiCamion);
			camion.setMerciPerMezzo(merciCamion);
			mezzo.add(camion);
			break;
			}
		return mezzo;
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
