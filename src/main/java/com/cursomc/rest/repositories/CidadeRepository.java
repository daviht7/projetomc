package com.cursomc.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursomc.rest.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer> {

	
	
}
