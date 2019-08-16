package com.cursomc.rest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.rest.domain.Categoria;
import com.cursomc.rest.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		return repo.findById(id).orElse(null);
		
		
	}
	
	
}
