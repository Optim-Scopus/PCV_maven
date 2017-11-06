/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.pcv;

import java.util.ArrayList;

/**
 *
 * @author Ken
 */
public class GerenciadorTour {
    
    // Holds our cities
    private static ArrayList cidades = new ArrayList<Cidade>();

    // Adds a destination city
    public static void addCidade(Cidade city) {
        cidades.add(city);
    }
    
    // Get a city
    public static Cidade getCidade(int index){
        return (Cidade) cidades.get(index);
    }
    
    // Get the number of destination cities
    public static int qtdCidades(){
        return cidades.size();
    }
    
}
