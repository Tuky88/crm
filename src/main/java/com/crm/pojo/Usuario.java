package com.crm.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "usuario" , schema = "mydb")
@Data
public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_usuario;
	
	private String usuario;
	
	private String nombre;
	
	private String correo;
	
	private int estatus;
	
	private String password;
	
	@Column(name="fk_tipo_usuario")
	private int fk_tipo_usuario;
}
