package com.AmbientSoft.main.service;

import com.AmbientSoft.main.model.Usuarios;
import com.AmbientSoft.main.repositorio.EmpleadoRepositorio;
import com.AmbientSoft.main.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GestorUsuario {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
//    public GestorUsuario(UsuarioRepositorio usuariosRepositorio){this.usuarioRepositorio=usuariosRepositorio;}

    public Usuarios crearUsuario(Usuarios Usuario){
       return this.usuarioRepositorio.save(Usuario);
    }

    public Usuarios buscarUsuarioCorreo(String correo){
      return  this.usuarioRepositorio.findByCorreo(correo);
    }

    public Usuarios obtenerOcrearUsuario(Map<String, Object> DatosUsuario){
        String correoUsuario = (String) DatosUsuario.get("email");
        Usuarios usuario = buscarUsuarioCorreo(correoUsuario);
        if(usuario==null){
        String nombre = (String) DatosUsuario.get("nickname");
        String imagenUsuario = (String) DatosUsuario.get("picture");
        String auth0IdUsuario = (String) DatosUsuario.get("sub");
            Usuarios Usuario = new Usuarios(correoUsuario,nombre,imagenUsuario,auth0IdUsuario);
            return crearUsuario(Usuario);
        }
        System.out.println(usuario.getCorreo());
        return usuario;

    }

}
