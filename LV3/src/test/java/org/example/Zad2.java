package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.example.FiksniBroj;
import org.example.Grad;
import org.example.Imenik;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Zad2 {
    private static Imenik imenik = new Imenik();

    @BeforeAll
    public static void pocetno(){
        imenik.dodaj("Emir",new FiksniBroj(Grad.SARAJEVO,"123-123"));
        imenik.dodaj("Mustafa",new FiksniBroj(Grad.ZENICA,"432-143"));
        imenik.dodaj("Lejla",new FiksniBroj(Grad.MOSTAR,"324-867"));
        imenik.dodaj("Amir",new FiksniBroj(Grad.BIJELJINA,"098-423"));
    }

    @Test
    public void dajBrojPostojeciKorisnik(){
        String s = imenik.dajBroj("Emir");
        assertEquals(s,"033/123-123");
    }

    @Test
    public void dajBrojNepostojeciKorisinik(){
        String s = imenik.dajBroj("Admir");
        assertNull(s);
    }

    @Test
    public void dodajDajBroj(){
        imenik.dodaj("Sulejman",new FiksniBroj(Grad.SARAJEVO,"000-000"));
        String s = imenik.dajBroj("Sulejman");
        assertEquals(s,"033/000-000");
    }
}