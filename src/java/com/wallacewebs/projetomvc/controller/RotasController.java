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
    public String cadastros(){
        return "cadastro";
    }
    @RequestMapping("/cadastrar")
    public String goCadastro(Model model, Processamento cadastro){
        CadastroDAO dao = new CadastroDAO();
        /*try {
            dao.adicionarProcesso(cadastro);
        } catch (SQLException ex) {
            System.out.println(ex);
        }*/
        return "cadastro";
    }
        
    @RequestMapping("/consulta")
    public String consultas(){
                
        return "consulta"; 
    }
}

