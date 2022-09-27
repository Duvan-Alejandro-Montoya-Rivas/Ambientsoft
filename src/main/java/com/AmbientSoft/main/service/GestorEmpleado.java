package com.AmbientSoft.main.service;


import com.AmbientSoft.main.model.Empleado;
import com.AmbientSoft.main.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
        empleadoRepositorio.save(empleados);
        return empleados;
    }


    public List<Empleado> eliminarEmpleado(Long id){
        empleadoRepositorio.deleteById(id);
        return empleadoRepositorio.findAll();

    }





}
