package com.cursomc.rest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cursomc.rest.domain.Categoria;
import com.cursomc.rest.domain.Cidade;
import com.cursomc.rest.domain.Estado;
import com.cursomc.rest.domain.Produto;
import com.cursomc.rest.repositories.CategoriaRepository;
import com.cursomc.rest.repositories.CidadeRepository;
import com.cursomc.rest.repositories.EstadoRepository;
import com.cursomc.rest.repositories.ProdutoRepository;

@SpringBootApplication
public class RestApplication implements CommandLineRunner {

	@Autowired
	public CategoriaRepository categoriaRepository;
	@Autowired
	public ProdutoRepository produtoRepository;
	@Autowired
	public EstadoRepository estadoRepository;
	@Autowired
	public CidadeRepository cidadeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria c1 = new Categoria(null,"Escrivaninha");
		Categoria c2 = new Categoria(null,"Sala");
		
		Produto p1 = new Produto(null,"Computador",2000.0);
		Produto p2 = new Produto(null,"Impressora",800.0);
		Produto p3 = new Produto(null,"Mouse",80.0);
		
		c1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		c2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(c1));
		p2.getCategorias().addAll(Arrays.asList(c1,c2));
		p3.getCategorias().addAll(Arrays.asList(c1));
		
		categoriaRepository.saveAll(Arrays.asList(c1,c2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		Estado e1 = new Estado(null,"Minas Gerais");
		Estado e2 = new Estado(null,"São Paulo");
		
		Cidade ci1 = new Cidade(null,"Uberlandia",e1);
		Cidade ci2 = new Cidade(null,"São Paulo",e2);
		
		e1.getCidades().add(ci1);
		e2.getCidades().add(ci2);
		
		estadoRepository.saveAll(Arrays.asList(e1,e2));
		cidadeRepository.saveAll(Arrays.asList(ci1,ci2));
		
	}

	
	
	
}
