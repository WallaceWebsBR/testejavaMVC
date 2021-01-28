package com.wallacewebs.projetomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author WallaceWebs
 */
@Controller
public class RotasController {
    
    @RequestMapping("/index")
    public String homepage(){
        return "index";
    }
    @RequestMapping("/cadastro")
    public String cadastros(){
        return "cadastro";
    }
    @RequestMapping("/consulta")
    public String consultas(){
        return "consulta";
    }
}
