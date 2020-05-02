package com.raiden.lead.service;

import java.util.List;


import com.raiden.lead.entity.Lead;


public interface ILeadService {

	List <Lead> searchAll();
	void save(Lead lead);
	void delete(int idLead);
	
}
