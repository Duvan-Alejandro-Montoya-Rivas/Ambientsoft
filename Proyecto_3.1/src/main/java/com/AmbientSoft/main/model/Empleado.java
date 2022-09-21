package com.AmbientSoft.main.model;

import com.AmbientSoft.main.Enums.Tipo;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empleado", nullable = false)
    private Long id_empleado;
    @Column(name="nombreEmpleado")
    private String nombreEmpleado;
    @Column(name="correo")
    private String correo;
    @Column(name="rol")
    private Tipo rol;

}