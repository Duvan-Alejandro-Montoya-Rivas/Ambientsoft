package com.AmbientSoft.main.controlador;

import com.AmbientSoft.main.model.Empresa;
import com.AmbientSoft.main.service.GestorEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    GestorEmpresa gestorEmpresa;

    @GetMapping("/Empresa")
    public List<Empresa> Empresa(){
        return gestorEmpresa.consultaListaEmpresa();
    }

    @GetMapping("/Empresa/{nit}")
    public Empresa traerUnaEmpresa(@PathVariable ("nit")Long identificadorEmpresa){
        return gestorEmpresa.consultaUnaEmpresa(identificadorEmpresa);
    }

    @PostMapping("/Empresa")
    public List<Empresa> crearEmpresa(@RequestBody Empresa empresa)
    {
        return gestorEmpresa.crearEmpresa(empresa);
    }


    @PatchMapping("/Empresa/{nit}")
    public Empresa actualizarNombreEmpresa(@PathVariable("nit")Long nit,@RequestBody Empresa nombreEmpresa){
        return gestorEmpresa.actualizarNombreEmpresa(nit,nombreEmpresa);
        // gestorEmpresa.consultaUnaEmpresa(nit);
    }

    @PutMapping("/Empresa/{nit}")
    public Empresa actualizarEmpresa(@PathVariable("nit")Long nit, @RequestBody Empresa empresa){
        return gestorEmpresa.actualizarEmpresa(nit,empresa);
    }
    @DeleteMapping("/Empresa/{nit}")
    public List<Empresa> quitarUnaEmpresa(@PathVariable("nit")Long identificadorEliminado){
        return gestorEmpresa.eliminarEmpresa(identificadorEliminado);
    }
}
