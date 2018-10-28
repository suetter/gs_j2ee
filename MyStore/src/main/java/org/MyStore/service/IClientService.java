package org.MyStore.service;

import org.MyStore.model.Client;

public interface IClientService {

	public  Client save(Client produit);
	public void delete(Long id);
	public Client update(Client produit);
	public Client findOne(Long id);
	
}
