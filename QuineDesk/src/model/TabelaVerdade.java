/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gusta
 */
public class TabelaVerdade {
    private int numEntradas;
    private int[][] binaries;
    private int[] niveis;
    
    public TabelaVerdade(int numEntradas, int niveis[]){
        this.numEntradas = numEntradas;
        this.niveis = niveis;
    }
    
    private void setBinaries(){
        this.binaries = new int[this.numEntradas][2^this.numEntradas];
    //    while(){};
    }

    public int getNumEntradas(){
        return this.numEntradas;
    }
    
    public int[] getNiveis(){
        return this.niveis;
    }
}
