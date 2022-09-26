package com.AmbientSoft.main.repositorio;
import com.AmbientSoft.main.model.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimientoDineroRepositorio extends JpaRepository<MovimientoDinero, Long>{
     List<MovimientoDinero> findByNit(Long nit);
}
