package com.AmbientSoft.main.repositorio;
import com.AmbientSoft.main.model.Empleado;
import com.AmbientSoft.main.model.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {

    List<Empleado> findByEmpresaNombreEmpresa(String nit_Empresa);

}
