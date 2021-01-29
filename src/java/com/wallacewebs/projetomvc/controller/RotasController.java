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
    //VIEW INICIAL
    @RequestMapping("/index")
    public String homepage(){
        return "index";
    }
    //VIEW CADASTRO
    @RequestMapping("/cadastro")
    public String cadastros(Model model) throws SQLException, ClassNotFoundException{
        CadastroDAO dao = new CadastroDAO();
        model.addAttribute("lista", dao.listarTP());
        return "cadastro";
    }
    //CONTROLLER SEGUNDO FORM
    @RequestMapping("/cadastrar")
    public String goCadastro(Processamento cadastro) throws ClassNotFoundException{
        CadastroDAO dao = new CadastroDAO();
        try {
            dao.adicionarProcesso(cadastro);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return "back";
    }
    
    //CADASTRA PRIMEIRO FORM CADASTRO
    @RequestMapping("/cadastratipoprocesso")
    public String goCadastroTP(Processamento tipoprocesso) throws ClassNotFoundException{
        CadastroDAO dao = new CadastroDAO();
        try {
            dao.adicionarTP(tipoprocesso);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return "back";
     }
     //REMOVE PRIMEIRO FORM CADASTRO
    @RequestMapping("/removertipoprocesso")
    public String goRemoveTP(Processamento tipoprocesso) throws ClassNotFoundException{
        CadastroDAO dao = new CadastroDAO();
        try {
            dao.removerTP(tipoprocesso);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return "back";
     }
    //EDITA PRIMEIRO FORM CADASTRO
    @RequestMapping("/updatetipoprocesso")
    public String goEditaTP(Processamento tipoprocesso) throws ClassNotFoundException{
        CadastroDAO dao = new CadastroDAO();
        try {
            dao.updateTP(tipoprocesso);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return "back";
     }
     //VIEW FORM EDICAO
    @RequestMapping("/editar")
    public String editar(Model model, Processamento search) throws ClassNotFoundException, SQLException{
        CadastroDAO dao = new CadastroDAO();
        model.addAttribute("id", search);
        model.addAttribute("dados", dao.consultarByID(search));
        return "edicao";
     }
    //EDITA CONTROLLER FORM
    @RequestMapping("/editaprocesso")
    public String goEditaCadastro(Processamento cadastro) throws ClassNotFoundException{
        CadastroDAO dao = new CadastroDAO();
        try {
            dao.editarProcesso(cadastro);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return "back";
     }
    //DELETE CONTROLLER FORM
    @RequestMapping("/deletarprocesso")
    public String godDeleteCadastro(Processamento id) throws ClassNotFoundException{
        CadastroDAO dao = new CadastroDAO();
        try {
            dao.deletarByID(id);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return "index";
     }
    //CONSULTA DA INDEX
    @RequestMapping("/consulta")
    public String consultas(Model model, Processamento search) throws SQLException, ClassNotFoundException{
        CadastroDAO dao = new CadastroDAO();
        model.addAttribute("lista", dao.consultar(search));
        return "consulta"; 
    }
    @RequestMapping("/back")
    public String voltar(){
        return "back"; 
    }
}

