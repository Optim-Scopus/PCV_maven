/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.pcv.calculadores_peso;

import com.tcc.pcv.Cidade;
import java.util.List;

/**
 *
 * @author Ken
 */
public abstract class CalculadorPeso {
    
    public int calculaPeso(List<Cidade> t){
        int peso = 0;
        for(int i = 0; i < t.size() - 1; i++){
            peso += calculaDistancia(t.get(i), t.get(i + 1)) + calculaEspera(t.get(i));
        }
        return peso;
    }
    
    private int calculaDistancia(Cidade c1, Cidade c2){
        int xDistance = Math.abs(c1.getX() - c2.getX());
        int yDistance = Math.abs(c1.getY() - c2.getY());
        return (int) Math.sqrt((xDistance*xDistance) + (yDistance*yDistance));
    }
    
    private  int calculaEspera(Cidade c1){
        return 0;
    }
    
}
