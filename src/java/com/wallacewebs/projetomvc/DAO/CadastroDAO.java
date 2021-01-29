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
        //
        // ADICIONA PROCESSO AO BD
        //
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
        //
        // CADASTRO TIPOS DE PROCESSO
        //
        public void adicionarTP(Processamento tipo) throws SQLException, ClassNotFoundException{
        ConexaoJDBC conn = new ConexaoJDBC();
        
        String sql = "INSERT INTO tiposprocesso (tipoprocesso) VALUES (?)";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ps.setString(1, tipo.getTipoprocesso());
        ps.execute();
    }
        //
        // REMOCAO TIPOS DE PROCESSO
        //
        public void removerTP(Processamento tipo) throws SQLException, ClassNotFoundException{
        ConexaoJDBC conn = new ConexaoJDBC();
        
        String sql = "DELETE FROM `tiposprocesso` WHERE `tiposprocesso`.`id` = ?";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ps.setInt(1, tipo.getId());
        ps.execute();
    }
        //
        // UPDATE TIPOS DE PROCESSO
        //
        public void updateTP(Processamento tipo) throws SQLException, ClassNotFoundException{
        ConexaoJDBC conn = new ConexaoJDBC();
        
        String sql = "UPDATE `tiposprocesso` SET `tipoprocesso` = ? WHERE `tiposprocesso`.`id` = ?";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ps.setString(1, tipo.getTipoprocesso());
        ps.setInt(2, tipo.getId());
        ps.execute();
    }
        
        //
        // CONSULTA DOS TIPOS DE PROCESSO
        //
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
        //
        // CONSULTAR PROCESSO PELO NÚMERO
        //
        public List<Processamento> consultar(Processamento search) throws SQLException, ClassNotFoundException{
        List<Processamento> lista = new ArrayList<>();
        ConexaoJDBC conn = new ConexaoJDBC();
        
        String sql = "SELECT * FROM processos WHERE numeroprocesso LIKE ?";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ps.setString(1,"%" + search.getNumeroprocesso() + "%");  
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
        Processamento dado = new Processamento();
        dado.setId(rs.getInt("id"));
        dado.setTipoprocesso(rs.getString("tipoprocesso"));
        dado.setNomeprocesso(rs.getString("nomeprocesso"));
        dado.setNumeroprocesso(rs.getString("numeroprocesso"));
        dado.setDataentrada(rs.getString("dataentrada"));
        dado.setValorrecurso(rs.getString("valorrecurso"));
        dado.setObjetivo(rs.getString("objetivo"));
        lista.add(dado);
        }
        return lista;
    }
}
