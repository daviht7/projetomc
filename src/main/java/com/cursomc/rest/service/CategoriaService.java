package com.cursomc.rest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.rest.domain.Categoria;
import com.cursomc.rest.repositories.CategoriaRepository;
import com.cursomc.rest.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Categoria obj = repo.findById(id).orElse(null);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		
		return obj;
	}
	
	
}
