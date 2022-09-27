package com.AmbientSoft.main.controlador;

import com.AmbientSoft.main.model.Usuarios;
import com.AmbientSoft.main.service.GestorUsuario;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;

@AllArgsConstructor
@NoArgsConstructor
@Controller
public class FrontController {
    @Autowired
    GestorUsuario gestorUsuario;


    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        if (principal != null) {
            Usuarios Usuario = this.gestorUsuario.obtenerOcrearUsuario(principal.getClaims());
            model.addAttribute("Usuario",Usuario);
            System.out.println(principal.getClaims());
        }
        return "index";
    }

    @GetMapping("/tasks")
        public String tasks(){
            return "tasks";
        }

}
