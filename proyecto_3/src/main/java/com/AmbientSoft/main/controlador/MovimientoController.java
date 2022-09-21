package com.AmbientSoft.main.controlador;


import com.AmbientSoft.main.model.MovimientoDinero;
import com.AmbientSoft.main.service.GestorMovimiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MovimientoController {

    @Autowired
    GestorMovimiento gestorMovimiento;

    @GetMapping("/MovimientoDinero")
    public List<MovimientoDinero> MD(){
        return gestorMovimiento.consultaListaMovimientoDinero();
    }

    @GetMapping("/Empresa/{nit}/MovimientoDinero")
    public List<MovimientoDinero> ObtenerMovimientos(@PathVariable ("nit")Long nit){
        return gestorMovimiento.consultaMovimientoEmpresa(nit);
    }

    @PostMapping("/Empresa/{nit}/MovimientoDinero")
    public List<MovimientoDinero> MD(@PathVariable ("nit")Long nit,@RequestBody MovimientoDinero MoDi)
    {
        return gestorMovimiento.crearMovimiento(nit,MoDi);
    }

    @PatchMapping("/Empresa/{nit}/MovimientoDinero")
    public MovimientoDinero actualizarCaveMovimiento(@PathVariable("nit")Long nit, @RequestBody MovimientoDinero MD_Nombre){
        return gestorMovimiento.actualizarNombreMovimiento(nit,MD_Nombre);
    }

    @PutMapping("/Empresa/{nit}/MovimientoDinero")
    public MovimientoDinero actualizarMovimiento(@PathVariable("nit")Long nit, @RequestBody MovimientoDinero MD){
        return gestorMovimiento.actualizarMovimiento(nit,MD);
    }

    @DeleteMapping("/Empresa/{nit}/MovimientoDinero")
    public List<MovimientoDinero> quitarUnMovimiento(@PathVariable("nit")Long nit,@RequestBody MovimientoDinero MD){
        return gestorMovimiento.eliminarMovimiento(MD.getId_MovimientoDinero());
    }
}
