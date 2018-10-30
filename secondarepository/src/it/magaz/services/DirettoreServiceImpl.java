package it.magaz.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.magaz.model.Autista;
import it.magaz.model.Camion;
import it.magaz.model.Destinazione;
import it.magaz.model.Direttore;
import it.magaz.model.Magazzino;
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
	public List<Direttore> creaDirettore(Magazzino magazzino) {
		// TODO Auto-generated method stub
		System.out.println("aggiungi direttore");
		Direttore direttore=new Direttore();
		direttore.setId(magazzino.getDirettori().size()+1);
		System.out.println("inserisci nome");
		direttore.setNome(input.nextLine());
		System.out.println("inserisci cognome");
		direttore.setCognome(input.nextLine());
		System.out.println("inserisci eta");
		direttore.setEta(input.nextInt());
		input.nextLine();
		System.out.println("inserisci il codice direttore");
		direttore.setCodic(input.nextLine());
		magazzino.getDirettori().add(direttore);
		return magazzino.getDirettori();
	}

	@Override
	public List<Operaio> aggiungiOperaio(Magazzino magazzino) {
		System.out.println("Crea operaio");
		Operaio operaio=new Operaio();
		operaio.setId(magazzino.getOperai().size()+1);
		System.out.println("Inserisci il nome: ");
		operaio.setNome(input.nextLine());
		System.out.println("Inserisci il cognome: ");
		operaio.setCognome(input.nextLine());
		System.out.println("Inserisci l' eta: ");
		operaio.setEta(input.nextInt());
		input.nextLine();
		magazzino.getOperai().add(operaio);
		return magazzino.getOperai();
	}

	@Override
	public List<Mezzo<?>> aggiuingiMezzo(Magazzino magazzino) {
		// TODO Auto-generated method stub
		System.out.println("che mezzo vuoi aggiungere? 1)nave 2)camion");
		int x=input.nextInt();
		switch(x) {
		case 1:
			Mezzo<Nave> nave=new Mezzo<Nave>(new Nave());
			List<Autista> autistiNave=new ArrayList<Autista>();
			List<Merce<?>> merciNave=new ArrayList<Merce<?>>();
			nave.getTipo().setId(magazzino.getMezzi().size()+1);
			System.out.println("inserisci il peso massimo che puo trasportare");
			nave.getTipo().setpMax(input.nextDouble());
			System.out.println("inserisci il numero di telaio");
			nave.getTipo().setnTelaio(input.nextLine());
			nave.getTipo().setpTot(0);
			nave.setAutistiPerMezzo(autistiNave);
			nave.setMerciPerMezzo(merciNave);
			magazzino.getMezzi().add(nave);
			break;
		case 2:
			Mezzo<Camion> camion=new Mezzo<Camion>(new Camion());
			List <Autista> autistiCamion=new ArrayList<Autista>();
			List<Merce<?>> merciCamion=new ArrayList<Merce<?>>();
			System.out.println("inserisci id camion");
			camion.getTipo().setId(magazzino.getMezzi().size()+1);
			System.out.println("inserisci il peso massimo che puo trasportare");
			camion.getTipo().setpMax(input.nextDouble());
			System.out.println("inserisci il numero di telaio");
			camion.getTipo().setnTelaio(input.nextLine());
			camion.getTipo().setpTot(0);
			camion.setAutistiPerMezzo(autistiCamion);
			camion.setMerciPerMezzo(merciCamion);
			magazzino.getMezzi().add(camion);
			break;
		}
			return magazzino.getMezzi();
		}

	@Override
	public List<Autista> aggiungiAutista(Magazzino magazzino) {
		
		List<Mezzo<?>>mez=new ArrayList<Mezzo<?>>();
		Autista autista = new Autista();
		System.out.println("Crea autista");
		autista.setId(magazzino.getAutisti().size()+1);
		System.out.println("Inserisci il nome: ");
		autista.setNome(input.nextLine());
		System.out.println("Inserisci il cognome: ");
		autista.setCognome(input.nextLine());
		System.out.println("Inserisci l' eta: ");
		autista.setEta(input.nextInt());
		input.nextLine();
		autista.setListmezaut(mez);
		magazzino.getAutisti().add(autista);
		return magazzino.getAutisti();
	}

	@Override
	public List<Merce<?>> aggiungiMerce(Magazzino magazzino) {
		// TODO Auto-generated method stub
		System.out.println("che merce vuoi aggiungere? 1)cibo 2)abbigliamento 3)informatica");
		int x=input.nextInt();
		switch(x) {
		case 1:
			Merce<MerceCibo> cibo=new Merce<MerceCibo>(new MerceCibo());
			List<Mezzo<?>>mezziCibo=new ArrayList<Mezzo<?>>();
			List<Operaio>operai=new ArrayList<Operaio>();
			Destinazione destinazione=new Destinazione();
			System.out.println("inserisci id");
			cibo.getContenuto().setId(magazzino.getMerci().size()+1);
			System.out.println("inserisci il peso");
			cibo.setPeso(input.nextDouble());
			input.nextLine();
			System.out.println("inserisci il costo");
			cibo.setCosto(input.nextDouble());
			input.nextLine();
			cibo.setMezziMerce(mezziCibo);
			cibo.setOperaiMerce(operai);
			cibo.getContenuto().setDestinazione(destinazione);
            System.out.println("inserisci la quantita");
			cibo.setQuantita(input.nextInt());
			magazzino.getMerci().add(cibo);
			break;
		case 2:
			Merce<MerceAbbigliamento> abbigliamento=new Merce<MerceAbbigliamento>(new MerceAbbigliamento());
			List<Mezzo<?>>mezziAbbigliamento=new ArrayList<Mezzo<?>>();
			List<Operaio>operaiAbb=new ArrayList<Operaio>();
			Destinazione destinazioneabb=new Destinazione();
			abbigliamento.getContenuto().setId(magazzino.getMerci().size()+1);
			System.out.println("inserisci il peso");
			abbigliamento.setPeso(input.nextDouble());
			input.nextLine();
			System.out.println("inserisci il costo");
			abbigliamento.setCosto(input.nextDouble());
			input.nextLine();
			abbigliamento.setMezziMerce(mezziAbbigliamento);
			abbigliamento.setOperaiMerce(operaiAbb);
			abbigliamento.getContenuto().setDestinazione(destinazioneabb);
			System.out.println("inserisci la quantita");
			abbigliamento.setQuantita(input.nextInt());
			magazzino.getMerci().add(abbigliamento);
			break;
		case 3:
			Merce<MerceInformatica> informatica=new Merce<MerceInformatica>(new MerceInformatica());
			List<Mezzo<?>>mezziInfo=new ArrayList<Mezzo<?>>();
			List<Operaio>operaiInfo=new ArrayList<Operaio>();
			Destinazione destinazioneinf=new Destinazione();
			informatica.getContenuto().setId(magazzino.getMerci().size()+1);
			System.out.println("inserisci il peso");
			informatica.setPeso(input.nextDouble());
			input.nextLine();
			System.out.println("inserisci il costo");
			informatica.setCosto(input.nextDouble());
			input.nextLine();
			informatica.setMezziMerce(mezziInfo);
			informatica.setOperaiMerce(operaiInfo);
			informatica.getContenuto().setDestinazione(destinazioneinf);
			System.out.println("inserisci la quantita");
			informatica.setQuantita(input.nextInt());
			magazzino.getMerci().add(informatica);
			break;
			
			
		}
		return magazzino.getMerci();
	}

	@Override
	public Merce<?> mercePiuTrasportata(Magazzino magazzino) {
		// TODO Auto-generated method stub
		int trasporto_max=0;
		int trasporto_finale=0;
		Merce<?> merce=null;
		for(Merce<?> i: magazzino.getMerci()) {
			trasporto_max=0;
			trasporto_max=trasporto_max+i.getMezziMerce().size();
			if(trasporto_finale<trasporto_max) {
				trasporto_finale=trasporto_max;
				merce=i;
			}
		}
		return merce;
	}
	

	@Override
	public Mezzo<?> mezzoPiuPesante(Magazzino magazzino) {
		// TODO Auto-generated method stub
		double peso_max=0;
		double peso_finale=0;
		Mezzo<?>mezzo=null;
		for(Mezzo<?> i: magazzino.getMezzi()) {
			peso_max=0;
			for(Merce<?> j: i.getMerciPerMezzo()) {
				peso_max=peso_max+j.getPeso();
			}
			if(peso_finale<peso_max) {
				peso_finale=peso_max;
				mezzo=i;
			}
		}
		return mezzo;
	}

	@Override
	public Mezzo<?> guadagnoMaggiore(Magazzino magazzino) {
		// TODO Auto-generated method stub
		double costo_max=0;
		double costo_finale=0;
		Mezzo<?>mezzo=null;
		for(Mezzo<?> i: magazzino.getMezzi()) {
			costo_max=0;
			for(Merce<?>j:i.getMerciPerMezzo()) {
				costo_max=costo_max+j.getCosto();
			}
			if(costo_finale<costo_max) {
				costo_finale=costo_max;
				mezzo=i;
			}
		}
		return mezzo;
	}

	@Override
	public Autista autistaPiuMezzi(Magazzino magazzino) {
		int max_mezzi=0;
		int mezzi_finale=0;
		Autista auto=null;
		for(Autista i: magazzino.getAutisti()){
			max_mezzi=0;
			max_mezzi=max_mezzi+i.getListmezaut().size();
			if(mezzi_finale<max_mezzi){
				mezzi_finale=max_mezzi;
				auto=i;
			}
		}
		return auto;
	}

	@Override
	public List<Merce<?>> naveCamion(Magazzino magazzino) {
		// TODO Auto-generated method stub
		List<Merce<?>> lista=new ArrayList<Merce<?>>();
		int trasporto_max=0;
		int trasporto_finale=0;
		int t=0;
		int f=0;
		Merce<?> merce=null;
		Merce<?>merce1=null;
		String mezzo="Nave";
		String mezzo1="Camion";
		for (Merce<?>i:magazzino.getMerci()) {
			trasporto_max=0;
			for(Mezzo<?>j:i.getMezziMerce()) {
				if(mezzo.equals(j.getClass().getName())) {
			trasporto_max=trasporto_max+i.getMezziMerce().size();
				}
			}
			if(trasporto_finale<trasporto_max) {
				trasporto_finale=trasporto_max;
				merce=i;
			}
		}
		lista.add(merce);
		for(Merce<?>i:magazzino.getMerci()) {
			t=0;
			for(Mezzo<?>j:i.getMezziMerce()) {
				if(mezzo1.equals(j.getClass().getName())) {
					t=t+i.getMezziMerce().size();
				}
			}
			if(f<t) {
				f=t;
				merce1=i;
			}
		}
		lista.add(merce1);
		return lista;
	}

	@Override
	public void vediAutisti(Magazzino magazzino) {
		List<Autista> listaAutista = magazzino.getAutisti();
		int j=0;
		for(Autista i: listaAutista)
		{
		System.out.println(j +") " + i);
		j++;
		}
	}
	
	@Override
	public void vediMezzi(Magazzino magazzino) {
		List<Mezzo<?>> listaMezzi = magazzino.getMezzi();
		int j = 0;
		for(Mezzo<?> i: listaMezzi)
		{
			System.out.println(j+") " + i);
			j++;
		}
	}

	@Override
	public void associaAutistaMezzo(Magazzino magazzino) {
		vediAutisti(magazzino);
		System.out.print("Scegli autista: ");
		int numAutista = input.nextInt();
		Autista autista = magazzino.getAutisti().get(numAutista);
		vediMezzi(magazzino);
		System.out.print("Scegli mezzo: ");;
		int numMezzo = input.nextInt();;
		Mezzo<?> mezzo = magazzino.getMezzi().get(numMezzo);
		autista.getListmezaut().add(mezzo);
	}
	
	

	@Override
	public void associaOperaiMerci(Magazzino magazzino) {
		vediOperai(magazzino);
		System.out.print("Scegli l'operaio: ");
		int nOperaio=input.nextInt();
		Operaio operaio=magazzino.getOperai().get(nOperaio);
		vediMerci(magazzino);
		System.out.print("Scegli la merce: ");
		int nMerce=input.nextInt();
		Merce<?>merce=magazzino.getMerci().get(nMerce);
		operaio.setMerce(merce);
		
		
	}

	@Override
	public void associaMerciMezzi(Magazzino magazzino) {
		// TODO Auto-generated method stub
		vediMerci(magazzino);
		System.out.println("scegli merce: ");
		int nMerce=input.nextInt();
		Merce<?>merce=magazzino.getMerci().get(nMerce);
		vediMezzi(magazzino);
		System.out.println("scegli un mezzo: ");
		int nMezzo=input.nextInt();
		Mezzo<?>mezzo=magazzino.getMezzi().get(nMezzo);
		merce.getMezziMerce().add(mezzo);
		
	}

	@Override
	public void vediOperai(Magazzino magazzino) {
		List<Operaio>listOperai=magazzino.getOperai();
		int j =0;
		for(Operaio i: listOperai)
		{
			System.out.println(j+") " + i);
			j++;
		}

	}

	@Override
	public void vediMerci(Magazzino magazzino) {
		List<Merce<?>>listMerce=magazzino.getMerci();	
		int i=0;
		for(Merce<?> j: listMerce)
		{
			System.out.println(i+") "+j);
			i++;
		}

	}

	
}