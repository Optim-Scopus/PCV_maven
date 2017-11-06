/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.pcv;

import com.tcc.pcv.calculadores_peso.CalculadorPeso;
import com.tcc.pcv.geradores_individuos.GeradorIndividuo;
import com.tcc.pcv.geradores_populacoes.GeradorPopulacao;
import com.tcc.pcv.mutadores.Mutador;

/**
 *
 * @author Ken
 */
public class PCVStrategy {
    
    private Mutador m;
    private CalculadorPeso cp;
    private GeradorIndividuo gi;
    private GeradorPopulacao gp;
    
    public PCVStrategy(Mutador m, CalculadorPeso cp, GeradorIndividuo gi, GeradorPopulacao gp){
        this.m = m;
        this.cp = cp;
        this.gi = gi;
        this.gp = gp;
    }
    
    public Mutador getMutador(){
        return m;
    }
    
    public CalculadorPeso getCalculadorPeso(){
        return cp;
    }
    
    public GeradorIndividuo getGeradorIndividuo(){
        return gi;
    }
    
    public GeradorPopulacao getGeradorPopulacao(){
        return gp;
    }
    
}
