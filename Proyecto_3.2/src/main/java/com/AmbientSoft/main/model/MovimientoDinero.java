package com.AmbientSoft.main.model;

import com.AmbientSoft.main.Enums.TipoMonto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EnableJpaRepositories
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_MovimientoDinero", nullable = false)
    private Long id_MovimientoDinero;
    @Column(name="montoMovimiento")
    private double montoMovimiento;
    @Column(name="tipoMonto")
    private TipoMonto tipoMonto;
    @Column(name="conceptoMovimiento")
    private String conceptoMovimiento;
    @Column(name = "nit")
    private Long nit;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="createdAt")
    private LocalDateTime createdAt;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="updatedAt")
    private LocalDateTime updatedAt;
    @Nullable
    @ManyToOne
    private Empresa empresa;
    @Nullable
    @ManyToOne
    private Empleado empleado;

}