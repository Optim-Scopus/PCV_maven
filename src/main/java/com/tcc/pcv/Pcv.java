/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.pcv;

import com.tcc.pcv.calculadores_peso.CalculadorPeso_Default;
import com.tcc.pcv.geradores_individuos.GeradorIndividuo_Default;
import com.tcc.pcv.geradores_populacoes.GeradorPopulacao_Default;
import com.tcc.pcv.mutadores.Mutador_Default;

/**
 *
 * @author Ken
 */
public class Pcv {
    
    private static final GerenciadorTour gt = new GerenciadorTour();
    // Aqui definimos quais instâSncias de cada módulo será utilizado
    private static final PCVStrategy strat = new PCVStrategy(
            new Mutador_Default(), 
            new CalculadorPeso_Default(), 
            new GeradorIndividuo_Default(20, gt),
            new GeradorPopulacao_Default(),
            20
    );
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create and add our cities
        Cidade city = new Cidade(60, 200, 0);
        gt.addCidade(city);
        Cidade city2 = new Cidade(180, 200, 0);
        gt.addCidade(city2);
        Cidade city3 = new Cidade(80, 180, 0);
        gt.addCidade(city3);
        Cidade city4 = new Cidade(140, 180, 0);
        gt.addCidade(city4);
        Cidade city5 = new Cidade(20, 160, 0);
        gt.addCidade(city5);
        Cidade city6 = new Cidade(100, 160, 0);
        gt.addCidade(city6);
        Cidade city7 = new Cidade(200, 160, 0);
        gt.addCidade(city7);
        Cidade city8 = new Cidade(140, 140, 0);
        gt.addCidade(city8);
        Cidade city9 = new Cidade(40, 120, 0);
        gt.addCidade(city9);
        Cidade city10 = new Cidade(100, 120, 0);
        gt.addCidade(city10);
        Cidade city11 = new Cidade(180, 100, 0);
        gt.addCidade(city11);
        Cidade city12 = new Cidade(60, 80, 0);
        gt.addCidade(city12);
        Cidade city13 = new Cidade(120, 80, 0);
        gt.addCidade(city13);
        Cidade city14 = new Cidade(180, 60, 0);
        gt.addCidade(city14);
        Cidade city15 = new Cidade(20, 40, 0);
        gt.addCidade(city15);
        Cidade city16 = new Cidade(100, 40, 0);
        gt.addCidade(city16);
        Cidade city17 = new Cidade(200, 40, 0);
        gt.addCidade(city17);
        Cidade city18 = new Cidade(20, 20, 0);
        gt.addCidade(city18);
        Cidade city19 = new Cidade(60, 20, 0);
        gt.addCidade(city19);
        Cidade city20 = new Cidade(160, 20, 0);
        gt.addCidade(city20);

        // Initialize population
        Populacao pop = new Populacao(50, true, strat);
        System.out.println("Initial distance: " + pop.getFittest().getPeso());

        // Evolve population for 100 generations
        pop = AG.evolvePopulacao(strat, pop);
        for (int i = 0; i < 100; i++) {
            pop = AG.evolvePopulacao(strat, pop);
        }

        // Print final results
        System.out.println("Finished");
        System.out.println("Final distance: " + pop.getFittest().getPeso());
        System.out.println("Solution:");
        System.out.println(pop.getFittest());
    }
    
}
