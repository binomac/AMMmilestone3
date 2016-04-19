/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sito.Oggetti.Classi;

/**
 *
 * @author luca
 */
public class Saldo {
    private int conto;
    public Saldo(int val){
        this.conto=val;
    }

    /**
     * @return the conto
     */
    public int getConto() {
        return conto;
    }

    /**
     * @param conto the conto to set
     */
    public void setConto(int conto) {
        this.conto = conto;
    }
    
}
