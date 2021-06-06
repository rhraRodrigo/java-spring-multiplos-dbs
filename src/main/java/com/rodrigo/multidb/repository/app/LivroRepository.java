package com.rodrigo.multidb.repository.app;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.multidb.model.app.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
