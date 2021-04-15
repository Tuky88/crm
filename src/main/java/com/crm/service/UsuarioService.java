package com.crm.service;

import java.util.List;

import com.crm.pojo.Usuario;


public interface UsuarioService {
	
	public List<Usuario> listarUsuarios();
	public void eliminar(Usuario usuario);
	public void insertar(Usuario usuario);
	public Usuario buscar(String usuario);
	public void cambiarEstado(Long id);
}
