package com.bci.apirest.usuario.usuariobci.model;

import lombok.Data;

import java.util.List;

@Data
public class Usuario {
	private String name;
	private String email;
	private String password;
	private String token;
	private long id;
	private String creacion;
	private String modficacion;
	private String ultimooIngreso;
	private List<Phones> phones;
}
