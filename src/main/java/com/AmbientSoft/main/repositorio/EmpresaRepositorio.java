package com.AmbientSoft.main.repositorio;
import com.AmbientSoft.main.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa, Long>{

}
