package secondarepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.magaz.model.Autista;
import it.magaz.model.Direttore;
import it.magaz.model.Magazzino;
import it.magaz.services.AutistaService;
import it.magaz.services.AutistaServiceImpl;
import it.magaz.services.DirettoreService;
import it.magaz.services.DirettoreServiceImpl;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Magazzino magazzino = new Magazzino();
		List<Direttore> direttori = new ArrayList<>();
		magazzino.setDirettori(direttori);
		DirettoreService direttore = new DirettoreServiceImpl();
		AutistaService autista = new AutistaServiceImpl();
		boolean exit=true;
		while(true) {
		if(magazzino.getDirettori().isEmpty())
		{
			direttore.creaDirettore(magazzino);
		}
		else {
			System.out.print("Inserisci codice direttore: ");
			String codice = input.nextLine();
			for(Direttore i: magazzino.getDirettori())
			{
			if(codice.equals(i.getCodic())){
				do {
				System.out.println("Benvenuto " + i.getNome() + " cosa vuoi fare ?");
				System.out.println("1) Assumi autista - 2) Assumi operaio - 3) Aggiungi merce - 4) Aggiungi mezzo\n"
						+ "5) Vedi la merce più trasportata - 6) Vedi il mezzo più pesante - 7) Vedi trasporto più redditizio\n"
						+ "8) Quale autista guida più mezzi - 9) Quale merce viaggia maggiormente in NAVE e quale in CAMION"
						+ "10) Assegna mezzo all'autista - 11) Assegna operaio a merce - 12) Assegna merci ai mezzi");
				int x =input.nextInt();
				switch(x) {
				
				case 1:
					direttore.aggiungiAutista(magazzino);
				break;
				
				case 2:
					direttore.aggiungiOperaio(magazzino);
					break;
				case 3:
					direttore.aggiungiMerce(magazzino);
					break;
				case 4:
					direttore.aggiuingiMezzo(magazzino);
					break;
				case 5:
					direttore.mercePiuTrasportata(magazzino);
					break;
				case 6:
					direttore.mezzoPiuPesante(magazzino);
					break;
				case 7:
					direttore.guadagnoMaggiore(magazzino);
					break;
				case 8:
					direttore.autistaPiuMezzi(magazzino);
					break;
				case 9:
					direttore.naveCamion(magazzino);
					break;
				case 10:
					direttore.associaAutistaMezzo(magazzino);
					break;
				case 11:
					direttore.associaOperaiMerci(magazzino);
					break;
				case 12:
					direttore.associaMerciMezzi(magazzino);
					break;
				case 13:
					exit=false;
					break;
				}
				
			}while(exit);
			
				}
			else 
			{
				
				for(Autista a: magazzino.getAutisti()) {
					long b;
					if((b = Long.parseLong(codice)) == a.getId()) {
						System.out.println("Benvenuto "+ a.getNome() + " vuoi vedere le caratteristiche dei mezzi da te guidati ?");
						String scelta = input.nextLine();
						if(scelta.equals("si"))
						{
							autista.vediMezzi(a);
						}
						else
						System.out.println("non sei registrato");
						}
						
					}
				}
			}
		}
	}
}
}