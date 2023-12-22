package com.example.lab7;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public PasswordField lozinka;
    public TextField korisnickoIme;
    public TextField email;
    public TextField prezime;
    public TextField ime;
    public ListView<Korisnik> lista;

    private KorisniciModel model;
    private Korisnik trenutniKorisnik;
    public HelloController(){
        model=new KorisniciModel();
        model.napuni();
    }
    public void onKrajClicked(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void onDodajClick(ActionEvent actionEvent) {
        model.dodajKorisnika();
    }
    @FXML
    public void initialize()
    {
        lista.setItems(model.getKorisnici());
        lista.getSelectionModel().selectedItemProperty().addListener((obs, oldKorisnik, newKorisnik) -> {
            model.setTrenutniKorisnik((Korisnik) newKorisnik);

            if(oldKorisnik!=null)
            {
                ime.textProperty().unbindBidirectional(oldKorisnik.imeProperty());
                prezime.textProperty().unbindBidirectional(oldKorisnik.prezimeProperty());
                email.textProperty().unbindBidirectional(oldKorisnik.emailProperty());
                korisnickoIme.textProperty().unbindBidirectional(oldKorisnik.korisnickoImeProperty());
                lozinka.textProperty().unbindBidirectional(oldKorisnik.lozinkaProperty());
            }
            if(newKorisnik==null){
                ime.setText("");
                prezime.setText("");
                email.setText("");
                korisnickoIme.setText("");
                lozinka.setText("");
            }
            else{
                ime.textProperty().bindBidirectional(newKorisnik.imeProperty());
                prezime.textProperty().bindBidirectional(newKorisnik.prezimeProperty());
                email.textProperty().bindBidirectional(newKorisnik.emailProperty());
                korisnickoIme.textProperty().bindBidirectional(newKorisnik.korisnickoImeProperty());
                lozinka.textProperty().bindBidirectional(newKorisnik.lozinkaProperty());
            }
            model.setTrenutniKorisnik(newKorisnik);
            lista.refresh();
        });
    }
}