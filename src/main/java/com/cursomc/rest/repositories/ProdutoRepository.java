package com.cursomc.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursomc.rest.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

	
	
}
