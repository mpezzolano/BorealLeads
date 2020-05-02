package com.raiden.lead.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.raiden.lead.entity.Lead;
import com.raiden.lead.repository.LeadRepository;
import com.raiden.lead.service.ILeadService;


@Service
public class LeadService implements ILeadService {
	
	@Autowired
	private LeadRepository repoLead;
	
	@Override
	public List<Lead> buscarTodos() {
		return repoLead.findAll();
		
	}
	
	@Override
	public void guardar(Lead lead) {
		repoLead.save(lead);
		
	}
	
	
	public void eliminar(int idLead) {
		repoLead.deleteById(idLead);
	}


}
