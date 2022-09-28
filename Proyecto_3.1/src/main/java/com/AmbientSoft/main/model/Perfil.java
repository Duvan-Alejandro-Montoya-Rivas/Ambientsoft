package com.AmbientSoft.main.model;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Perfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_perfil", nullable = false)
    private String idPerfil;
    @Column(name="imagen")
    private String imagen;
    @Column(name="telefono")
    private String telefono;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="createdAt")
    private LocalDateTime createdAt;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="updatedAt")
    private LocalDateTime updatedAt;

    @Nullable
    @OneToOne
    private Empleado empleado;



}
