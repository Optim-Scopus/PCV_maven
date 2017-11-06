/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.pcv.geradores_individuos;

import java.util.ArrayList;
import java.util.Collections;
import com.tcc.pcv.Cidade;
import com.tcc.pcv.GerenciadorTour;

/**
 *
 * @author Ken
 */
public abstract class GeradorIndividuo {
    
    public ArrayList<Cidade> geraIndividuo(){
        ArrayList<Cidade> tour = new ArrayList<Cidade>();
        // Loop through all our destination cities and add them to our tour
        for (int i = 0; i < GerenciadorTour.qtdCidades(); i++) {
          tour.add(GerenciadorTour.getCidade(i));
        }
        // Randomly reorder the tour
        Collections.shuffle(tour);
        return tour;
    }
}
