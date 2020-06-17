package com.raiden.lead.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.raiden.lead.entity.Lead;
import com.raiden.lead.service.ILeadService;

@RestController
@RequestMapping("/api")
public class LeadController {

	@Autowired
	private ILeadService serviceLeads;
	
	@GetMapping("/leads")
	public List<Lead> searchAll(){
		return serviceLeads.searchAll();
	}
	
	@PostMapping("/leads")
	public Lead save(@RequestBody Lead lead) {
	  serviceLeads.save(lead);
	  return lead;
	}

	@GetMapping("/lead/getAll")
	public List<Lead> searchAll2(){
		return serviceLeads.searchAll();
	}

	@DeleteMapping("/leads/{id}")
	public String delete(@PathVariable("id") int leadId) {
		serviceLeads.delete(leadId);
		return "Deleted!";
		
	}
	
	

}
