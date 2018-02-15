package com.mycompany.klassi_komplekt;

public class Pallivise {
    Pall lendaja;
    Pall sihtkoht;
    void alusta(){
        lendaja=new Pall(10,200,10);
        sihtkoht=new Pall(250,120,20);
    }
    String kasPihtas(){
        return lendaja.kasPuutuvad(sihtkoht);
    }
    void liigu(){
        lendaja.liigu();
        System.out.println(lendaja +" "+kasPihtas());
    }
}
