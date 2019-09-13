package com.iala.cpd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iala.cpd.repository.GrupoRepository;

@Service
public class PerCaptaService {
	
	@Autowired
	private GrupoRepository grupoRepository;
	
	
	
}