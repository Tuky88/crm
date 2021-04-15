package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crm.pojo.Usuario;
import com.crm.service.UsuarioServiceImpl;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;


@RestController
@Log4j2
public class UsuarioController {
	
	@Autowired
	private UsuarioServiceImpl usuarioservice;
	
	@GetMapping(value = "/crm/usuarios/")
	public List<Usuario> obtenerUsuarios(){
		 return usuarioservice.listarUsuarios();
		
	}
	@GetMapping(value = "/crm/usuarios/{usuario}")
	public Usuario obtenerUsuario(@PathVariable("usuario") String usuario ){
		 Usuario u=usuarioservice.buscar(usuario);
		 log.info(u.getUsuario() +  "--"+ u.getCorreo());
		 return u;
	}
	
	@PostMapping(value="/crm/usuarios/crear/")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		usuarioservice.insertar(usuario);
		return usuario;
	}
	
	
	
}
