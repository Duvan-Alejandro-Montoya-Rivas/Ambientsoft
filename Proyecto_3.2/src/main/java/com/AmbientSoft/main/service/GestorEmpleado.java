package com.AmbientSoft.main.service;


import com.AmbientSoft.main.model.Empleado;
import com.AmbientSoft.main.model.Empresa;
import com.AmbientSoft.main.model.MovimientoDinero;
import com.AmbientSoft.main.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GestorEmpleado {
    @Autowired
    EmpleadoRepositorio empleadoRepositorio;


   public List<Empleado> consultaListaEmpleados(){
       return empleadoRepositorio.findAll();
   }

   public List<Empleado> crearEmpleado(Empleado empleado){
       empleadoRepositorio.save(empleado);
       return empleadoRepositorio.findAll();

   }

   public Empleado consultaUnEmpleado(Long id){
       return empleadoRepositorio.findById(id).get();
   }

   public Empleado actualizarNombreEmpleado(Long id, Empleado empleado){
        Empleado empleados = empleadoRepositorio.findById(id).get();
        empleados.setNombreEmpleado(empleado.getNombreEmpleado());
        empleadoRepositorio.save(empleados);
       return empleados;
   }

    int cont_N=0;
    int cont_C=0;
    int cont_R=0;
    int cont_Perfil=0;
    int cont_Empresa=0;
    int cont_Movimientos=0;

       public Empleado actualizarEmpleado(Long id, Empleado empleado){
        Empleado empleados = empleadoRepositorio.findById(id).get();

        if (cont_N==0 || empleado.getNombreEmpleado()!=null){
               empleados.setNombreEmpleado(empleado.getNombreEmpleado());
               if (empleado.getNombreEmpleado()!=null){
                   cont_N=1;
               }
           }

           if (cont_C==0 || empleado.getCorreo()!=null){
               empleados.setCorreo(empleado.getCorreo());
               if (empleado.getCorreo()!=null){
                   cont_C=1;
               }
           }

           if (cont_R==0 || empleado.getRol()!=null){
               empleados.setRol(empleado.getRol());
               if (empleado.getRol()!=null){
                   cont_R=1;
               }
           }

           if (cont_Perfil==0 || empleado.getPerfil()!=null){
               empleados.setPerfil(empleado.getPerfil());
               if (empleado.getPerfil()!=null){
                   cont_Perfil=1;
               }
           }

           if (cont_Empresa==0 || empleado.getEmpresa()!=null){
               empleados.setEmpresa(empleado.getEmpresa());
               if (empleado.getEmpresa()!=null){
                   cont_Empresa=1;
               }
           }

           if (cont_Movimientos==0 || empleado.getMovimientos()!=null){
               empleados.setMovimientos(empleado.getMovimientos());
               if (empleado.getMovimientos()!=null){
                   cont_Movimientos=1;
               }
           }


        empleados.setUpdatedAt(LocalDateTime.now());
        empleadoRepositorio.save(empleados);
        return empleados;
    }

    public boolean saveOrUpdateEmpleado(Empleado empleado){
        Empleado emp=empleadoRepositorio.save(empleado);
        if (empleadoRepositorio.findById(empleado.getId_empleado())!=null){
            return true;
        }
        return false;
    }

    public Empleado getEmpleadoById(Long id){
           return empleadoRepositorio.findById(id).get();
    }

    public boolean deleteEmpleado(Long id){
        empleadoRepositorio.deleteById(id);  //Eliminar

        if (empleadoRepositorio.findById(id)!=null){  //Verificacion del servicio eliminacion
            return true;
        }
        return false;
    }

    public List<Empleado> getEmpleadoEmpresa(String nit_Empresa){
        return empleadoRepositorio.findByEmpresaNombreEmpresa(nit_Empresa);
    }


    public List<Empleado> eliminarEmpleado(Long id){
        empleadoRepositorio.deleteById(id);
        return empleadoRepositorio.findAll();

    }





}
