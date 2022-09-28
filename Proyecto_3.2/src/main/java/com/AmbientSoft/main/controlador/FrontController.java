package com.AmbientSoft.main.controlador;

import com.AmbientSoft.main.model.MovimientoDinero;
import com.AmbientSoft.main.service.GestorMovimiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;

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
}
