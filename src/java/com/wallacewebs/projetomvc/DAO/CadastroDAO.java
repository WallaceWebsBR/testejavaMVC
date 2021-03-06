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
        ps.close();
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
        ps.close();
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
        ps.close();
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
        ps.close();
    }   
        //
        // UPDATE TIPOS DE PROCESSO
        //
        public void editarProcesso(Processamento tipo) throws SQLException, ClassNotFoundException{
        ConexaoJDBC conn = new ConexaoJDBC();
        
        String sql = "UPDATE `processos` SET `tipoprocesso` = ?, `nomeprocesso` = ?, `numeroprocesso` = ?, `dataentrada` = ?, `valorrecurso` = ?, `objetivo` = ? WHERE `processos`.`id` = ?;";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ps.setString(1, tipo.getTipoprocesso());
        ps.setString(2, tipo.getNomeprocesso());
        ps.setString(3, tipo.getNumeroprocesso());
        ps.setString(4, tipo.getDataentrada());
        ps.setString(5, tipo.getValorrecurso());
        ps.setString(6, tipo.getObjetivo());
        ps.setInt(7, tipo.getId());
        ps.execute();
        ps.close();
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
        rs.close();
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
        rs.close();
        return lista;
    }
        //
        // CONSULTAR PROCESSO PELO ID
        //
        public List<Processamento> consultarByID(Processamento search) throws SQLException, ClassNotFoundException{
        List<Processamento> dados = new ArrayList<>();
        ConexaoJDBC conn = new ConexaoJDBC();
        
        String sql = "SELECT * FROM processos WHERE id LIKE ?";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ps.setInt(1, search.getId());  
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
        dados.add(dado);
        }
        rs.close();
        return dados;
        }
        //
        // DELETAR PROCESSO PELO ID
        //
        public void deletarByID(Processamento id) throws SQLException, ClassNotFoundException{
        ConexaoJDBC conn = new ConexaoJDBC();
        
        String sql = "DELETE FROM `processos` WHERE `processos`.`id` = ?";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ps.setInt(1, id.getId());  
        ps.execute();
        ps.close();
        }
}
