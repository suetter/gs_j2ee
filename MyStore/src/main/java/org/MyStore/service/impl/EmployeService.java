package org.MyStore.service.impl;

import org.MyStore.dao.EmployeRepository;
import org.MyStore.model.Employe;
import org.MyStore.service.IEmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EmployeService implements IEmployeService{

	
	@Autowired
	private EmployeRepository employeRepo;
	
	@Override
	public Employe save(Employe produit) {
		// TODO Auto-generated method stub
		return employeRepo.save(produit);
	}

	@Override
	public void delete(Long id) {
		employeRepo.deleteById(id);
		
	}

	@Override
	public Employe update(Employe produit) {
		
		return employeRepo.save(produit);
	}

	@Override
	public Employe findOne(Long id) {
		return employeRepo.getOne(id);
	}

}
