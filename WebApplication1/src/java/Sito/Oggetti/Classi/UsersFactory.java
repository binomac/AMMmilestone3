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

    /* Costruttore */
    private UsersFactory() {
    }
    /*Metodi*/
    public static UsersFactory getInstance() {
        if (singleton == null) {
            singleton = new UsersFactory();
        }
        return singleton;
    }
    public ArrayList<Users> getUserList() {
        ArrayList<Users> listaUtenti = new ArrayList<Users>();
        //oggetti vendita
        
        //auto
        
        ItemsVendita auto1 = new ItemsVendita();
        auto1.setId(0);
        auto1.setCategoria("auto");
        auto1.setNome("Alfa romeo");
        auto1.setPrezzo(33000);
        auto1.setDescrizione("");
        auto1.setURL("img/alfaRomeo.jpg");
        auto1.setQuantita(1);
        
        ItemsVendita auto2 = new ItemsVendita();
        auto2.setId(1);
        auto2.setCategoria("auto");
        auto2.setNome("Fiat 500");
        auto2.setPrezzo(17500);
        auto2.setDescrizione("");
        auto2.setURL("img/fiat500.jpg");
        auto2.setQuantita(1);
        
         ItemsVendita auto3 = new ItemsVendita();
        auto3.setId(2);
        auto3.setCategoria("auto");
        auto3.setNome("Ferrari 488");
        auto3.setPrezzo(220000);
        auto3.setDescrizione("");
        auto3.setURL("img/ferrari488.jpg");
        auto1.setQuantita(1);
        
         ItemsVendita auto4 = new ItemsVendita();
        auto4.setId(3);
        auto4.setCategoria("auto");
        auto4.setNome("Toyota Rav4");
        auto4.setPrezzo(37000);
        auto4.setDescrizione("");
        auto4.setURL("img/toyota_rav4.jpg");
        auto4.setQuantita(1);
        
         ItemsVendita auto5 = new ItemsVendita();
        auto5.setId(4);
        auto5.setCategoria("auto");
        auto5.setNome("Mercedes classe c");
        auto5.setPrezzo(50000);
        auto5.setDescrizione("");
        auto5.setURL("img/mercedes_classC.jpg");
        auto5.setQuantita(1);
        
        
        //moto
        
         ItemsVendita moto1 = new ItemsVendita();
        moto1.setCategoria("Moto");
        moto1.setDescrizione("");
        moto1.setId(5);
        moto1.setNome("Bmw r1100");
        moto1.setPrezzo(50000);
        moto1.setQuantita(1);
        moto1.setURL("img/bmwr1100rs.jpg");
        
        ItemsVendita moto2 = new ItemsVendita();
        moto2.setCategoria("Moto");
        moto2.setDescrizione("");
        moto2.setId(6);
        moto2.setNome("Ducati 748");
        moto2.setPrezzo(120000);
        moto2.setQuantita(1);
        moto2.setURL("img/ducati748.jpg");
        
        
        //yatch
        
        ItemsVendita yatch1= new ItemsVendita();
        yatch1.setId(7);
        yatch1.setCategoria("Yatch");
        yatch1.setNome("Saramour 46m");
        yatch1.setPrezzo(1110000);
        yatch1.setDescrizione("");
        yatch1.setQuantita(1);
        yatch1.setURL("img/saramour.jpg");
        
        //barche
        
        ItemsVendita barca1= new ItemsVendita();
        barca1.setId(8);
        barca1.setCategoria("Barche");
        barca1.setNome("Bsc 570");
        barca1.setPrezzo(7000);
        barca1.setDescrizione("");
        barca1.setQuantita(1);
        barca1.setURL("img/bsc570.jpg");
        
        ItemsVendita barca2= new ItemsVendita();
        barca2.setId(9);
        barca2.setCategoria("Barche");
        barca2.setNome("Chaparral 275");
        barca2.setPrezzo(41600);
        barca2.setDescrizione("");
        barca2.setQuantita(1);
        barca2.setURL("img/chaparral275.jpg");
        
        
         
        return listaUtenti;
    }
   
    
}
