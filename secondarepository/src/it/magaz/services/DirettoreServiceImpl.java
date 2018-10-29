package it.magaz.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.magaz.model.Autista;
import it.magaz.model.Camion;
import it.magaz.model.Direttore;
import it.magaz.model.Merce;
import it.magaz.model.MerceAbbigliamento;
import it.magaz.model.MerceCibo;
import it.magaz.model.MerceInformatica;
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
		
		List<Mezzo<?>>mez=new ArrayList<Mezzo<?>>();
		System.out.println("Crea autista");
		System.out.println("Inserisci l'ID dell'autista: ");
		autista.setId(input.nextLong());
		System.out.println("Inserisci il nome: ");
		autista.setNome(input.nextLine());
		System.out.println("Inserisci il cognome: ");
		autista.setCognome(input.nextLine());
		System.out.println("Inserisci l' eta: ");
		autista.setEta(input.nextInt());
		autista.setListmezaut(mez);
		List<Autista> autis=new ArrayList<Autista>();
		autis.add(autista);
		
		return autis;
	}

	@Override
	public List<Merce<?>> aggiungiMerce(List<Merce<?>> merce) {
		// TODO Auto-generated method stub
		System.out.println("che merce vuoi aggiungere? 1)cibo 2)abbugliamento 3)informatica");
		int x=input.nextInt();
		switch(x) {
		case 1:
			Merce<MerceCibo> cibo=new Merce<MerceCibo>(new MerceCibo());
			List<Mezzo<?>>mezziCibo=new ArrayList<Mezzo<?>>();
			List<Operaio>operai=new ArrayList<Operaio>();
			System.out.println("inserisci id");
			cibo.getContenuto().setId(input.nextLong());
			System.out.println("inserisci il peso");
			cibo.setPeso(input.nextDouble());
			System.out.println("inserisci il costo");
			cibo.setCosto(input.nextDouble());
			cibo.setMezziMerce(mezziCibo);
			cibo.setOperaiMerce(operai);
			System.out.println("inserisci la quantita");
			cibo.setQuantita(input.nextInt());
			merce.add(cibo);
			break;
		case 2:
			Merce<MerceAbbigliamento> abbigliamento=new Merce<MerceAbbigliamento>(new MerceAbbigliamento());
			List<Mezzo<?>>mezziAbbigliamento=new ArrayList<Mezzo<?>>();
			List<Operaio>operaiAbb=new ArrayList<Operaio>();
			System.out.println("inserisci id");
			abbigliamento.getContenuto().setId(input.nextLong());
			System.out.println("inserisci il peso");
			abbigliamento.setPeso(input.nextDouble());
			System.out.println("inserisci il costo");
			abbigliamento.setCosto(input.nextDouble());
			abbigliamento.setMezziMerce(mezziAbbigliamento);
			abbigliamento.setOperaiMerce(operaiAbb);
			System.out.println("inserisci la quantita");
			abbigliamento.setQuantita(input.nextInt());
			merce.add(abbigliamento);
			break;
		case 3:
			Merce<MerceInformatica> informatica=new Merce<MerceInformatica>(new MerceInformatica());
			List<Mezzo<?>>mezziInfo=new ArrayList<Mezzo<?>>();
			List<Operaio>operaiInfo=new ArrayList<Operaio>();
			System.out.println("inserisci id");
			informatica.getContenuto().setId(input.nextLong());
			System.out.println("inserisci il peso");
			informatica.setPeso(input.nextDouble());
			System.out.println("inserisci il costo");
			informatica.setCosto(input.nextDouble());
			informatica.setMezziMerce(mezziInfo);
			informatica.setOperaiMerce(operaiInfo);
			System.out.println("inserisci la quantita");
			informatica.setQuantita(input.nextInt());
			merce.add(informatica);
			break;
			
			
		}
		return merce;
	}

	@Override
	public Merce<?> mercePiuTrasportata(List<Merce<?>> merci) {
		// TODO Auto-generated method stub
		int trasporto_max=0;
		int trasporto_finale=0;
		Merce<?> merce=null;
		for(int i=0;i<merci.size();i++) {
			trasporto_max=0;
			trasporto_max=trasporto_max+merci.get(i).getMezziMerce().size();
			if(trasporto_finale<trasporto_max) {
				trasporto_finale=trasporto_max;
				merce=merci.get(i);
			}
		}
		return merce;
	}
	

	@Override
	public Mezzo<?> mezzoPiuPesante(List<Mezzo<?>> mezzi) {
		// TODO Auto-generated method stub
		double peso_max=0;
		double peso_finale=0;
		Mezzo<?>mezzo=null;
		for(int i=0;i<mezzi.size();i++) {
			peso_max=0;
			for(int j=0;j<mezzi.get(i).getMerciPerMezzo().size();j++) {
				peso_max=peso_max+mezzi.get(i).getMerciPerMezzo().get(j).getPeso();
			}
			if(peso_finale<peso_max) {
				peso_finale=peso_max;
				mezzo=mezzi.get(i);
			}
		}
		return mezzo;
	}

	@Override
	public Mezzo<?> guadagnoMaggiore(List<Mezzo<?>> mezzi) {
		// TODO Auto-generated method stub
		double costo_max=0;
		double costo_finale=0;
		Mezzo<?>mezzo=null;
		for(int i=0;i<mezzi.size();i++) {
			costo_max=0;
			for(int j=0;j<mezzi.get(i).getMerciPerMezzo().size();j++) {
				costo_max=costo_max+mezzi.get(i).getMerciPerMezzo().get(j).getCosto();
			}
			if(costo_finale<costo_max) {
				costo_finale=costo_max;
				mezzo=mezzi.get(i);
			}
		}
		return mezzo;
	}

	@Override
	public Autista autistaPiuMezzi(List<Autista> autisti) {
		int max_mezzi=0;
		Autista auto=null;
		for(int i=0;i<autisti.size();i++)
		{
			if(autisti.get(i).getListmezaut().size()>max_mezzi)
			{
				max_mezzi=autisti.get(i).getListmezaut().size();
				auto=autisti.get(i);
			}
		}
		return auto;
	}

	@Override
	public Merce<?> naveCamion(List<Merce<?>> merci) {
		// TODO Auto-generated method stub
		return null;
	}

}
