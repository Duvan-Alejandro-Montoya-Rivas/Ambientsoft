package com.AmbientSoft.main.repositorio;


import com.AmbientSoft.main.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuarios, Long> {
    Usuarios findByCorreo(String correo);
}
