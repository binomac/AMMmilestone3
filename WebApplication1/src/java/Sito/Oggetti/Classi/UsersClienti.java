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
public class UsersClienti extends Users {
    private Saldo credito= new Saldo(0);
    public UsersClienti(){
        super();
    }

    /**
     * @return the credito
     */
    public Saldo getCredito() {
        return credito;
    }

    /**
     * @param credito the credito to set
     */
    public void setCredito(Saldo credito) {
        this.credito = credito;
    }
}
