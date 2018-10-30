package it.magaz.services;

import it.magaz.model.Autista;
import it.magaz.model.Direttore;
import it.magaz.model.Mezzo;

public class AutistaServiceImpl implements AutistaService {

	@Override
	public void vediMezzi(Direttore direttore) {
		
		for(Autista i:direttore.getListaAutisti())
		{
			for(Mezzo<?> j: i.getListmezaut())
			{
				System.out.println(j);
			}		
		}
	}

}
