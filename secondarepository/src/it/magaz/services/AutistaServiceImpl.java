package it.magaz.services;

import it.magaz.model.Autista; 

import it.magaz.model.Mezzo;

public class AutistaServiceImpl implements AutistaService {

	@Override
	public void vediMezzi(Autista autista) {
			for(Mezzo<?> j: autista.getListmezaut())
			{
				System.out.println(j);
			}		
	}

}
