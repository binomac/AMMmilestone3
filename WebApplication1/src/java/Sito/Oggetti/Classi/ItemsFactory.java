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
public class ItemsFactory {
    private static ArrayList<ItemsVendita> listaAuto = new ArrayList<ItemsVendita>() ;
    private static ArrayList<ItemsVendita> listaMoto = new ArrayList<ItemsVendita>() ;
    private static ArrayList<ItemsVendita> listaYatch = new ArrayList<ItemsVendita>() ;
    private static ArrayList<ItemsVendita> listaBarche = new ArrayList<ItemsVendita>() ;
    private static ItemsFactory singleton;

    /**
     * @return the listaAuto
     */
    public ArrayList<ItemsVendita> getListaAuto() {
        return listaAuto;
    }

    /**
     * @return the listaMoto
     */
    public ArrayList<ItemsVendita> getListaMoto() {
        return listaMoto;
    }

    /**
     * @return the listaYatch
     */
    public ArrayList<ItemsVendita> getListaYatch() {
        return listaYatch;
    }

    /**
     * @return the listaBarche
     */
    public ArrayList<ItemsVendita> getListaBarche() {
        return listaBarche;
    }
    
    private ItemsFactory(){
        PopolaListe();        
    }
    
    public static ItemsFactory GetIstance(){
         if (singleton == null) {
            singleton = new ItemsFactory();
        }
        return singleton;
    }
    
    private void PopolaListe(){
        /*
            AUTO
        */
        
        ItemsVendita auto1 = new ItemsVendita();
        auto1.setCategoria("Auto");
        auto1.setNome("Alfa romeo");
        auto1.setPrezzo(33000);
        auto1.setDescrizione("");
        auto1.setURL("alfaRomeo.jpg");
        auto1.setQuantita(1);
        
        ItemsVendita auto2 = new ItemsVendita();
        auto2.setId(1);
        auto2.setCategoria("Auto");
        auto2.setNome("Fiat 500");
        auto2.setPrezzo(17500);
        auto2.setDescrizione("");
        auto2.setURL("fiat500.jpg");
        auto2.setQuantita(1);
        
         ItemsVendita auto3 = new ItemsVendita();
        auto3.setId(2);
        auto3.setCategoria("Auto");
        auto3.setNome("Ferrari 488");
        auto3.setPrezzo(220000);
        auto3.setDescrizione("");
        auto3.setURL("ferrari488.jpg");
        auto3.setQuantita(1);
        
         ItemsVendita auto4 = new ItemsVendita();
        auto4.setId(3);
        auto4.setCategoria("Auto");
        auto4.setNome("Toyota Rav4");
        auto4.setPrezzo(37000);
        auto4.setDescrizione("");
        auto4.setURL("toyota_rav4.jpg");
        auto4.setQuantita(1);
        
         ItemsVendita auto5 = new ItemsVendita();
        auto5.setId(4);
        auto5.setCategoria("Auto");
        auto5.setNome("Mercedes classe c");
        auto5.setPrezzo(50000);
        auto5.setDescrizione("");
        auto5.setURL("mercedes_classC.jpg");
        auto5.setQuantita(1);
        
        getListaAuto().add(auto1);
        getListaAuto().add(auto2);
        getListaAuto().add(auto3);
        getListaAuto().add(auto4);
        getListaAuto().add(auto5);
        
        /*
            MOTO
        */
        
        ItemsVendita moto1 = new ItemsVendita();
        moto1.setCategoria("Moto");
        moto1.setDescrizione("");
        moto1.setId(5);
        moto1.setNome("Bmw r1100");
        moto1.setPrezzo(50000);
        moto1.setQuantita(1);
        moto1.setURL("bmwr1100rs.jpg");
        
        ItemsVendita moto2 = new ItemsVendita();
        moto2.setCategoria("Moto");
        moto2.setDescrizione("");
        moto2.setId(6);
        moto2.setNome("Ducati 748");
        moto2.setPrezzo(120000);
        moto2.setQuantita(1);
        moto2.setURL("ducati748.jpg");
        
        getListaMoto().add(moto1);
        getListaMoto().add(moto2);
        
        /*
            YATCH
        */
        
        ItemsVendita yatch1= new ItemsVendita();
        yatch1.setId(7);
        yatch1.setCategoria("Yatch");
        yatch1.setNome("Saramour 46m");
        yatch1.setPrezzo(1110000);
        yatch1.setDescrizione("");
        yatch1.setQuantita(1);
        yatch1.setURL("saramour.jpg");
        
        getListaYatch().add(yatch1);
        
        /*
            BARCHE
        */
        
        ItemsVendita barca1= new ItemsVendita();
        barca1.setCategoria("Barche");
        barca1.setNome("Bsc 570");
        barca1.setPrezzo(7000);
        barca1.setDescrizione("");
        barca1.setQuantita(1);
        barca1.setURL("bsc570.jpg");
        
        ItemsVendita barca2= new ItemsVendita();
        //barca2.setId(9);
        barca2.setCategoria("Barche");
        barca2.setNome("Chaparral 275");
        barca2.setPrezzo(41600);
        barca2.setDescrizione("");
        barca2.setQuantita(1);
        barca2.setURL("chaparral275.jpg");
        
        getListaBarche().add(barca1);
        getListaBarche().add(barca2);
        
        
        
    }
}
