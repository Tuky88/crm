package com.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.dao.UsuarioDAO;
import com.crm.pojo.Usuario;
@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioDAO usuariodao;
	
	@Override
	public List<Usuario> listarUsuarios() {
		return (List<Usuario>) usuariodao.findAll();	
	}

	@Override
	public void eliminar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Usuario usuario) {
		usuariodao.save(usuario);
	}

	@Override
	public Usuario buscar(String usuario) {
		return usuariodao.findByUsuario(usuario);
	}

	@Override
	public void cambiarEstado(Long id) {
		// TODO Auto-generated method stub
		
	}

}
