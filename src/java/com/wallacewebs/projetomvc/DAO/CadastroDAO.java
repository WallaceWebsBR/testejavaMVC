/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wallacewebs.projetomvc.DAO;

import com.wallacewebs.projetomvc.domain.Processamento;
import com.wallacewebs.projetomvc.conexao.ConexaoJDBC;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author WallaceWebs
 */
public class CadastroDAO {
    public void adicionarProcesso(Processamento cadastro) throws SQLException{
        ConexaoJDBC conn = new ConexaoJDBC();
        
        String sql = "INSERT INTO `processos` (`id`, `tipoprocesso`, `nomeprocesso`, `numeroprocesso`, `dataentrada`, `valorrecurso`, `objetivo`) VALUES (NULL, ?,?,?,?,?,?)";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ps.setString(1, cadastro.getTipoprocesso());
        ps.setString(2, cadastro.getNomeprocesso());
        ps.setString(3, cadastro.getNumeroprocesso());
        ps.setString(4, cadastro.getDataentrada());
        ps.setString(5, cadastro.getValorrecurso());
        ps.setString(6, cadastro.getObjetivo());
        ps.execute();
    }  
}
