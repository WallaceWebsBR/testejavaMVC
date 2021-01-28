/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wallacewebs.projetomvc.DAO;

import com.wallacewebs.projetomvc.domain.Processamento;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author WallaceWebs
 */
public class PopularBD {
    public static void main(String[] args) {
        Processamento conn = new Processamento();
        CadastroDAO dao = new CadastroDAO();
        
        conn.setNomeprocesso("Teste");
        conn.setNumeroprocesso("123");
        conn.setTipoprocesso("Proc1");
        conn.setValorrecurso("200000.00");
        try {
            dao.adicionarProcesso(conn);
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(PopularBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
