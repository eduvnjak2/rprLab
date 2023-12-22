package com.example.lab7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class KorisniciModelTest {
    @Test
    public void Test1(){
        KorisniciModel km=new KorisniciModel();
        km.napuni();
        assertEquals(km.getTrenutniKorisnik().getIme(),"Emir");
    }

    @Test
    public void Test2(){
        KorisniciModel km=new KorisniciModel();
        km.dodajKorisnika();
        assertNotEquals(km.getTrenutniKorisnik().getPrezime(), "Duvnjak");
    }

    @Test
    public void Test3(){
        KorisniciModel km=new KorisniciModel();
        assertThrows(NullPointerException.class, ()->{km.getTrenutniKorisnik();});
    }

}