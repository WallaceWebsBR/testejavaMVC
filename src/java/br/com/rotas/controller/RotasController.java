package br.com.rotas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author WallaceWebs
 */
@Controller
public class RotasController {
    
    @RequestMapping("/home")
    public String homepage(){
        return "index";
    }
    @RequestMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }
}
