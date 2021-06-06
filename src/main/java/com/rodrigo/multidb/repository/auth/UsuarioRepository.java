package com.rodrigo.multidb.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.multidb.model.auth.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
