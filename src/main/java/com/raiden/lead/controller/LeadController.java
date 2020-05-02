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
	public List<Lead> buscarTodos(){
		return serviceLeads.buscarTodos();
	}
	
	@PostMapping("/leads")
	public Lead guardar(@RequestBody Lead lead) {
	  serviceLeads.guardar(lead);
	  return lead;
	}


	@DeleteMapping("/leads/{id}")
	public String eliminar(@PathVariable("id") int idLead) {
		serviceLeads.eliminar(idLead);
		return "registro eliminado";
		
	}
	
	

}
