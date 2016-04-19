/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sito.Oggetti.Classi;

import java.util.ArrayList;

/**
 *
 * @author luca
 */
public class UsersVenditori {
    private Saldo credito= new Saldo(0);
    private ArrayList<ItemsVendita> InserzioniAperte = new ArrayList<ItemsVendita>();
    public UsersVenditori(){
        super();
    }

    /**
     * @return the credito
     */
    public Saldo getCredito() {
        return credito;
    }

    /**
     * @return the InserzioniAperte
     */
    public ArrayList<ItemsVendita> getInserzioniAperte() {
        return InserzioniAperte;
    }

    /**
     * @param credito the credito to set
     */
    public void setCredito(Saldo credito) {
        this.credito = credito;
    }

    /**
     * @param InserzioniAperte the InserzioniAperte to set
     */
    public void setInserzioniAperte(ArrayList<ItemsVendita> InserzioniAperte) {
        this.InserzioniAperte = InserzioniAperte;
    }
}
