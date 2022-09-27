package com.AmbientSoft.main.controlador;


import com.AmbientSoft.main.model.Empleado;
import com.AmbientSoft.main.service.GestorEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {
    @Autowired
    GestorEmpleado gestorEmpleado;

    @GetMapping("/Empleado")
    public List<Empleado> Empleado(){
        return gestorEmpleado.consultaListaEmpleados();
    }

    @GetMapping("/Empleado/{id}")
    public Empleado traerUnEmpleado(@PathVariable ("id")Long identificador){
        return gestorEmpleado.consultaUnEmpleado(identificador);
    }

    @PostMapping("/Empleado")
    public List<Empleado> crearEmpleado(@RequestBody Empleado empleado)
    {
        return gestorEmpleado.crearEmpleado(empleado);
    }

    @PatchMapping("/Empleado/{id}")
        public Empleado actualizarNombreEmpleado(@PathVariable("id")Long id,@RequestBody Empleado nombreEmpleado){
         return gestorEmpleado.actualizarNombreEmpleado(id,nombreEmpleado);
    }

    @PutMapping("/Empleado/{id}")
    public Empleado actualizarEmpleado(@PathVariable("id")Long id, @RequestBody Empleado nombreEmpleado){
        return gestorEmpleado.actualizarEmpleado(id,nombreEmpleado);
    }

    @DeleteMapping("/Empleado/{id}")
    public List<Empleado> quitarUnEmpleado(@PathVariable ("id")Long identificadorEliminado){
        return gestorEmpleado.eliminarEmpleado(identificadorEliminado);
    }

}


