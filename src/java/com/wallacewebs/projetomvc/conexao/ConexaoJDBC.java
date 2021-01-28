/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wallacewebs.projetomvc.conexao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author WallaceWebs
 */
public class ConexaoJDBC {
    private Connection conn;
    
    private void conectar(){
        System.out.println("Conectando com o Banco de Dados...");
        try {
            Class.forName("com.mysql.jdbc.Connection");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/processodb", "root", "root");
        } catch (ClassNotFoundException | SQLException err) {
            System.out.println("Ocorreu erro:" + err);
            Logger.getLogger(ConexaoJDBC.class.getName()).log(Level.SEVERE, null, err);
        }
    }
    
    public Connection getConexao(){
        conectar();
        return conn;
    }
}
