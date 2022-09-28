package com.AmbientSoft.main.repositorio;
import com.AmbientSoft.main.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {

}
