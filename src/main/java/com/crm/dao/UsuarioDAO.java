package com.crm.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.crm.pojo.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Long> {

	public Usuario findByUsuario(String usuario);
}
