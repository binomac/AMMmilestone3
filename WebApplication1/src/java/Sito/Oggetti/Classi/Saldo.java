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
    private double conto;
    private static int counter=0;
    private int id;
    
    public Saldo(double val){
        this.conto=val;
        this.id=counter ;
        counter++;
    }

    /**
     * @return the conto
     */
    public double getConto() {
        return conto;
    }

    /**
     * @param conto the conto to set
     */
    public void setConto(double conto) {
        this.conto = conto;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
