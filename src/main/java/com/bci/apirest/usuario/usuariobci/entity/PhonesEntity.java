package com.bci.apirest.usuario.usuariobci.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USUARIO")
@Data
public class PhonesEntity {
    @Id
    private String number;
    private String citycode;
    private String contrycode;
}
