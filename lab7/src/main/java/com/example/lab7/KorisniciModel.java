package com.example.lab7;
import java.util.AbstractList;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnici=FXCollections.observableArrayList();

    private SimpleObjectProperty<Korisnik> trenutniKorisnik=new SimpleObjectProperty<>();



    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public Korisnik getTrenutniKorisnik() {
        if(this.trenutniKorisnik.get()==null) throw new NullPointerException("Trenutni korisnik je null!");
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    public void napuni() {
        korisnici.add(new Korisnik("Emir","Duvnjak","e@gmail.com","duve","emir123"));
        korisnici.add(new Korisnik("Emir2","Duvnjak2","e2@gmail.com","duve2","emir1234"));
        //trenutniKorisnik.set(korisnici.get(0));
        trenutniKorisnik.set(korisnici.get(0));
    }
    public void dodajKorisnika(){
        Korisnik novi=new Korisnik("", "", "", "", "");
        korisnici.add(novi);
        trenutniKorisnik.set(novi);
    }

}

