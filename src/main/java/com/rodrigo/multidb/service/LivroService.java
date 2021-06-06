package com.rodrigo.multidb.service;

import java.util.List;

import com.rodrigo.multidb.model.app.Livro;

public interface LivroService {

	public List<Livro> obterLivros();
	
	public Livro criar(Livro livro);
}
