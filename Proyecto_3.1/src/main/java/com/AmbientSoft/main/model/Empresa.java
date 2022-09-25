package com.AmbientSoft.main.model;


import java.time.LocalDateTime;
import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "nit_Empresa", nullable = false)
    private Long nit_Empresa;
    @Column(name="nombreEmpresa")
    private String nombreEmpresa;
    @Column(name="numeroDocumentoEmpresa")
    private String documentoEmpresa;
    @Column(name="telefono")
    private long telefono;
    @Column(name="direccion")
    private String direccion;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="createdAt")
    private LocalDateTime createdAt;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="updatedAt")
    private LocalDateTime updatedAt;
}
