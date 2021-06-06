package com.rodrigo.multidb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.multidb.model.app.Livro;
import com.rodrigo.multidb.model.auth.Usuario;
import com.rodrigo.multidb.repository.app.LivroRepository;
import com.rodrigo.multidb.repository.auth.UsuarioRepository;
import com.rodrigo.multidb.service.LivroService;

@Service
public class LivroServiceImpl implements LivroService {

	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Livro> obterLivros() {
		return this.livroRepository.findAll();
	}

	@Override
	public Livro criar(Livro livro) {

		Usuario usuario = this.usuarioRepository
				.findById(livro.getCodigoUsuario())
				.orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado."));

		livro.setNomeUsuario(usuario.getNome());
		
		return this.livroRepository.save(livro);
	}
}
