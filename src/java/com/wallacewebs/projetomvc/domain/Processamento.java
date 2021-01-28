/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wallacewebs.projetomvc.domain;

/**
 *
 * @author WallaceWebs
 */
public class Processamento {
    
    private int id;
    private String tipoprocesso;
    private String nomeprocesso;
    private String numeroprocesso;
    private String dataentrada;
    private String valorrecurso;
    private String objetivo;

    public String getTipoprocesso() {
        return tipoprocesso;
    }

    public void setTipoprocesso(String tipoprocesso) {
        this.tipoprocesso = tipoprocesso;
    }

    public String getNomeprocesso() {
        return nomeprocesso;
    }

    public void setNomeprocesso(String nomeprocesso) {
        this.nomeprocesso = nomeprocesso;
    }

    public String getNumeroprocesso() {
        return numeroprocesso;
    }

    public void setNumeroprocesso(String numeroprocesso) {
        this.numeroprocesso = numeroprocesso;
    }

    public String getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(String dataentrada) {
        this.dataentrada = dataentrada;
    }

    public String getValorrecurso() {
        return valorrecurso;
    }

    public void setValorrecurso(String valorrecurso) {
        this.valorrecurso = valorrecurso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}

