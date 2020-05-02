package com.raiden.lead.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raiden.lead.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Integer> {

}
