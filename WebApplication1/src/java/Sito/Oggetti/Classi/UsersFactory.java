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
public class UsersFactory {
     private static UsersFactory singleton;
     private static ArrayList<Users> listaUtenti;

    /* Costruttore */
    private UsersFactory() {
        listaUtenti = new ArrayList<Users>();
        ItemsFactory data = ItemsFactory.GetIstance();
        
        
        //venditori
        ArrayList<ItemsVendita> lista0= new ArrayList<ItemsVendita>();
        ArrayList<ItemsVendita> lista1= new ArrayList<ItemsVendita>();
        for(ItemsVendita i:ItemsFactory.getListaAuto()){
            if(i.getId()%2==1){
                lista0.add(i);
            }
            else lista1.add(i);
        }
        for(ItemsVendita i:ItemsFactory.getListaMoto()){
            if(i.getId()%2==1){
                lista0.add(i);
            }
            else lista1.add(i);
        }
        for(ItemsVendita i:ItemsFactory.getListaYatch()){
            if(i.getId()%2==1){
                lista0.add(i);
            }
            else lista1.add(i);
        }
        for(ItemsVendita i:ItemsFactory.getListaBarche()){
            if(i.getId()%2==1){
                lista0.add(i);
            }
            else lista1.add(i);
        }
        
        UsersVenditori venditore1 = new UsersVenditori();
        venditore1.setUsername("lucac");
        venditore1.setCognome("Camboni");
        venditore1.setNome("Luca");
        venditore1.setPassword("12");
        venditore1.setCredito(new Saldo(0));
        venditore1.setInserzioniAperte(lista0);
        listaUtenti.add(venditore1);
        
        UsersVenditori venditore2 = new UsersVenditori();
        
        venditore2.setUsername("professore");
        venditore2.setCognome("Spano");
        venditore2.setNome("Davide");
        venditore2.setPassword("0");
        venditore2.setCredito(new Saldo(0));
        venditore2.setInserzioniAperte(lista1);
        listaUtenti.add(venditore2);
        
        //clienti
        UsersClienti cliente1 = new UsersClienti();
        cliente1.setUsername("compra");
        cliente1.setPassword("1");
        cliente1.setNome("carlo");
        cliente1.setCognome("compra");
        cliente1.setCredito(new Saldo(0));
        listaUtenti.add(cliente1);
        
        UsersClienti cliente2 = new UsersClienti();
        cliente2.setUsername("maco");
        cliente2.setPassword("2");
        cliente2.setNome("mauro");
        cliente2.setCognome("compra");
        cliente2.setCredito(new Saldo(0));
        listaUtenti.add(cliente2);
    }
    /*Metodi*/
    public static UsersFactory getInstance() {
        if (singleton == null) {
            singleton = new UsersFactory();
        }
        return singleton;
    }
    public static ArrayList<Users> getUserList() {
         
        return listaUtenti;
    }
   
    
}
