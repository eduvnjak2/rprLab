package org.example;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
        GeografijaDAO dao=GeografijaDAO.getInstance();
        Drzava drzava=new Drzava();
        Grad grad = new Grad();
        grad.setNaziv("Berlin");
        grad.setBrojStanovnika(1000000);
        drzava.setNaziv("Njemacka");
        drzava.setGlavniGrad(grad);
        grad.setDrzava(drzava);
        dao.dodajDrzavu(drzava);
        //System.out.println("ok");
        glavniGrad();
    }

    public static String ispisiGradove() {
        GeografijaDAO geografijaDAO = GeografijaDAO.getInstance();
        ArrayList<Grad> gradovi = geografijaDAO.gradovi();
        String vrati="";
        for(Grad g : gradovi)
            vrati+=g.getNaziv()+ " (" + g.getDrzava().getNaziv() + ") - " + g.getBrojStanovnika()+"\n";
        return vrati;
    }

    public static void glavniGrad() {
        System.out.println("Unesite ime drzave: ");
        Scanner scanner = new Scanner(System.in);
        String drzava = scanner.nextLine();

        GeografijaDAO geografijaDAO = GeografijaDAO.getInstance();
        Grad grad = geografijaDAO.glavniGrad(drzava);
        if(grad == null) System.out.println("Nepostojeća država");
        else System.out.println(String.format("Glavni grad države %s je %s", drzava, grad.getNaziv()));
    }

}