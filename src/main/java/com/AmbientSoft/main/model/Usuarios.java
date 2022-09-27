package com.AmbientSoft.main.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Usuarios")
public class Usuarios{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario", nullable = false)
    private Long id_usuario;
    @Column(name="correo",unique = true)
    private String correo;
    @Column(name="imagen")
    private String imagen;

    @Column(name="nombre")
    private String nombre;
    @Column(name="auth0Id",unique = true)
    private String auth0Id;

    public Usuarios(String correo, String nombre, String imagen, String auth0Id) {
        this.correo = correo;
        this.nombre = nombre;
        this.imagen = imagen;
        this.auth0Id = auth0Id;
    }


//    public Usuarios(String correo, String imagen, String auth0Id) {
//        this.correo = correo;
//        this.imagen = imagen;
//        this.auth0Id = auth0Id;
//    }

}

    //    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="createdAt")
//    private LocalDateTime createdAt;
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="updatedAt")
//    private LocalDateTime updatedAt;

