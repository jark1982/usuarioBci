package com.bci.apirest.usuario.usuariobci.entity;

import lombok.Data;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
@Data
public class UsuarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_name")
	private String name;
	@Column(name = "email", nullable = true, length = 200)
	private String email;
	@Column(name = "createed")
	private Date created;
	@Column(name = "modified")
	private Date modified;
	@Column(name = "token")
	private String token;
	@Column(name = "last_login")
	private Date lastLogin;
	@Column(name = "password")
	private String password;
}
