package com.AmbientSoft.main.controlador;

import com.AmbientSoft.main.model.Empresa;
import com.AmbientSoft.main.model.MovimientoDinero;
import com.AmbientSoft.main.service.GestorEmpresa;
import com.AmbientSoft.main.service.GestorMovimiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class FrontController {

    @Autowired
    GestorMovimiento gestorMovimiento;

    @GetMapping("/MovimientosDinero")
    public String movimientodinero(Model model){
        model.addAttribute("listamovimientos",gestorMovimiento.consultaListaMovimientoDinero());
        return "movimientodinero";
    }

    @GetMapping("/AgregarMovimiento")
    public String nuevoMovimiento(Model model, @ModelAttribute("mensaje") String mensaje){
        MovimientoDinero emp= new MovimientoDinero();
        model.addAttribute("emp",emp);
        model.addAttribute("mensaje",mensaje);
        return "agregarMovimiento";
    }

    @PostMapping("/GuardarMovimiento")
    public String guardarMovimiento(MovimientoDinero emp, RedirectAttributes redirectAttributes){
        if(gestorMovimiento.saveOrUpdateMovimiento(emp)==true){
            redirectAttributes.addFlashAttribute("mensaje","saveOK");
            return "redirect:/MovimientosDinero";
        }
        redirectAttributes.addFlashAttribute("mensaje","saveError");
        return "redirect:/AgregarMovimiento";
    }

    @GetMapping("/EditarMovimiento/{id}")
    public String editarMovimiento(Model model, @PathVariable Long id, @ModelAttribute("mensaje") String mensaje){
        MovimientoDinero emp=gestorMovimiento.getMovimientoById(id);
        //Creamos un atributo para el modelo, que se llame igualmente emp y es el que ira al html para llenar o alimentar campos
        model.addAttribute("emp",emp);
        model.addAttribute("mensaje", mensaje);
        return "editarMovimiento";
    }

    @PostMapping("/ActualizarMovimiento")
    public String updateMovimiento(@ModelAttribute("emp") MovimientoDinero emp, RedirectAttributes redirectAttributes){
        if(gestorMovimiento.saveOrUpdateMovimiento(emp)){
            redirectAttributes.addFlashAttribute("mensaje","updateOK");
            return "redirect:/MovimientosDinero";
        }
        redirectAttributes.addFlashAttribute("mensaje","updateError");
        return "redirect:/EditarMovimiento";

    }

    @GetMapping("/EliminarMovimiento/{id}")
    public String eliminarMovimiento(@PathVariable Long id, RedirectAttributes redirectAttributes){
        if (gestorMovimiento.deleteMovimiento(id)==true){
            redirectAttributes.addFlashAttribute("mensaje","deleteOK");
            return "redirect:/MovimientosDinero";
        }
        redirectAttributes.addFlashAttribute("mensaje", "deleteError");
        return "redirect:/MovimientosDinero";
    }

    @GetMapping("/MovimientosDinero/{nit_Empresa}/Empresa")
    public String getMovimientosEmpresa(Model model, @PathVariable String nit_Empresa){
        model.addAttribute("listamovimientosempresa",gestorMovimiento.getMovimientosEmpresa(nit_Empresa));
        return "movimientosEmpresa";

    }

    @GetMapping("/MovimientosDinero/{nit_Empleado}/Empleado")
    public String getMovimientosEmpleado(Model model, @PathVariable String nit_Empleado){
        model.addAttribute("listamovimientosempresa",gestorMovimiento.getMovimientosEmpleado(nit_Empleado));
        return "movimientosEmpresa";

    }


}
