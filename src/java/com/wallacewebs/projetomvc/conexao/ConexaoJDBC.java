/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wallacewebs.projetomvc.conexao;

import com.mysql.jdbc.Connection;
import java.sql.*;
/**
 *
 * @author WallaceWebs
 */
public class ConexaoJDBC {
    private Connection conn;
    
    private void conectar() throws SQLException, SQLException, ClassNotFoundException{
        System.out.println("Conectando com o Banco de Dados...");
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/processodb", "root", "root");
    }
    
    public Connection getConexao() throws SQLException, ClassNotFoundException{
        conectar();
        return conn;
    }
}
