/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wallacewebs.projetomvc.DAO;

import com.wallacewebs.projetomvc.domain.Processamento;
import com.wallacewebs.projetomvc.conexao.ConexaoJDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WallaceWebs
 */
public class CadastroDAO {
    public void adicionarProcesso(Processamento cadastro) throws SQLException, ClassNotFoundException{
        ConexaoJDBC conn = new ConexaoJDBC();
        
        String sql = "INSERT INTO processos (tipoprocesso, nomeprocesso, numeroprocesso, dataentrada, valorrecurso, objetivo) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ps.setString(1, cadastro.getTipoprocesso());
        ps.setString(2, cadastro.getNomeprocesso());
        ps.setString(3, cadastro.getNumeroprocesso());
        ps.setString(4, cadastro.getDataentrada());
        ps.setString(5, cadastro.getValorrecurso());
        ps.setString(6, cadastro.getObjetivo());
        ps.execute();
    }
        public void adicionarTP(Processamento cadastro) throws SQLException, ClassNotFoundException{
        ConexaoJDBC conn = new ConexaoJDBC();
        
        String sql = "INSERT INTO tiposprocesso (nome) VALUES (?)";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ps.setString(1, cadastro.getTipoprocesso());
        ps.execute();
    }
        public List<Processamento> listarTP() throws SQLException, ClassNotFoundException{
        List<Processamento> lista = new ArrayList<>();
        ConexaoJDBC conn = new ConexaoJDBC();
        
        String sql = "SELECT * FROM tiposprocesso";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
        Processamento dado = new Processamento();
        dado.setId(rs.getInt("id"));
        dado.setTipoprocesso(rs.getString("tipoprocesso"));
        lista.add(dado);
        }
        return lista;
    }
}
