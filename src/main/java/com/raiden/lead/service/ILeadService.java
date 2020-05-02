package com.raiden.lead.service;

import java.util.List;


import com.raiden.lead.entity.Lead;


public interface ILeadService {

	List <Lead> buscarTodos();
	void guardar(Lead lead);	
	void eliminar(int idLead);
	
}
