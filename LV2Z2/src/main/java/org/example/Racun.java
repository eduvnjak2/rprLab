package org.example;

import java.util.Objects;

public class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;
    private Double prekoracenje;

    public Racun(Long brojRacuna, Osoba korisnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
    }
    public boolean provjeriOdobrenjePrekoracenja(Double n){
        return this.prekoracenje > n;
    }
    public boolean izvrsiUplatu(Double n){
        this.stanjeRacuna+=n;
        return true;
    }
    public boolean izvrsiIsplatu(Double n){
        if(this.stanjeRacuna + this.prekoracenje < n){
            return false;
        }else{
            return true;
        }
    }
    public void odobriPrekoracenje(Double n){this.prekoracenje=n;}

    public Long getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Osoba getKorisnikRacuna() {
        return korisnikRacuna;
    }

    public void setKorisnikRacuna(Osoba korisnikRacuna) {
        this.korisnikRacuna = korisnikRacuna;
    }
    public boolean isOdobrenjePrekoracenja(){return odobrenjePrekoracenja;}

    public void setOdobrenjePrekoracenja(boolean odobrenjePrekoracenja) {
        this.odobrenjePrekoracenja = odobrenjePrekoracenja;
    }

    public Double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(Double stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }

    public Double getPrekoracenje() {
        return prekoracenje;
    }

    public void setPrekoracenje(Double prekoracenje) {
        this.prekoracenje = prekoracenje;
    }
}