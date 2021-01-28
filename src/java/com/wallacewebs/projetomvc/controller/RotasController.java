package com.wallacewebs.projetomvc.controller;

import com.wallacewebs.projetomvc.DAO.CadastroDAO;
import com.wallacewebs.projetomvc.domain.Processamento;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String cadastros(Model model, Processamento cadastro){
        CadastroDAO dao = new CadastroDAO();
        try {
            dao.adicionarProcesso(cadastro);
            model.addAttribute("status", "Cadastrado com Sucesso!");
        } catch(SQLException ex){
            model.addAttribute("status", "Ocorreu um Erro!!!");
            System.out.println("Ocorreu um erro: " + ex);
        }
        return "cadastro";
    }
    
    @RequestMapping("/consulta")
    public String consultas(){
                
        return "consulta"; 
    }
}
