/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.pcv;

/**
 *
 * @author Ken
 */
public class Cidade {
    
    int id;
    int x;
    int y;
    
    Cidade(int x, int y, int id){
        this.x = x;
        this.y = y;
        this.id = id;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public int getId(){
        return this.id;
    }
    
    @Override
    public String toString(){
        return getX()+", "+getY();
    }
    
}
