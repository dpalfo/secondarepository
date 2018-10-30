package it.magaz.services;

import it.magaz.model.Autista;

import it.magaz.model.Magazzino;
import it.magaz.model.Mezzo;

public class AutistaServiceImpl implements AutistaService {

	@Override
	public void vediMezzi(Magazzino magazzino) {
		
		for(Autista i:magazzino.getAutisti())
		{
			for(Mezzo<?> j: i.getListmezaut())
			{
				System.out.println(j);
			}		
		}
	}

}
