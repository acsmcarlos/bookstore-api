package com.antonio.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antonio.bookstore.domain.Categoria;
import com.antonio.bookstore.domain.Livro;
import com.antonio.bookstore.repository.CategoriaRepository;
import com.antonio.bookstore.repository.LivroRepository;

@Service
public class dbService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null, "INFORMÁTICA", "LIVROS DE TI");
		Categoria cat2 = new Categoria(null, "FICÇÃO CIENTÍFICA", "FICÇÃO CIENTÍFICA");
		Categoria cat3 = new Categoria(null, "BIOGRAFIAS", "LIVROS DE BIOGRAFIAS");
				
		Livro l1 = new Livro(null, "CLEAN CODE", "ROBERT MARTIN", "LOREM IPSUM", cat1);
		Livro l2 = new Livro(null, "ENGENHARIA DE SOFTWARE", "LOUIS V. GERSTNER", "LOREM IPSUM", cat1);
		Livro l3 = new Livro(null, "THE TIME MACHINE", "H.G. WELLS", "LOREM IPSUM", cat2);
		Livro l4 = new Livro(null, "THE WAR OF THE WORLDS", "H.G. WELLS", "LOREM IPSUM", cat2);
		Livro l5 = new Livro(null, "I, ROBOT", "ISSAC ASIMOV", "LOREM IPSUM", cat2);
				
		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));
				
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}

}
