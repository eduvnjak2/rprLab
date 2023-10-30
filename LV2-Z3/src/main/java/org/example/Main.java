package org.example;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    List<Double>lista=new ArrayList<Double>();
    while(true){
        System.out.println("Unesite broj ili stop");
        String unos=scanner.nextLine();
        if("stop".equalsIgnoreCase(unos.trim())) break;
        try{
            Double broj=Double.parseDouble(unos);
            lista.add(broj);
        }
        catch (Exception ex){
            System.out.println("Unos nije broj!");
            continue;
        }
    }
    System.out.println("Minimum: "+Formule.minimum(lista));
    System.out.println("Maximum: "+Formule.maksimum(lista));
    System.out.println("Srednja vrijednost: "+Formule.srednjaVrijednost(lista));
    System.out.println("Standardna devijacija: "+Formule.standardnaDevijacija(lista));
    }
}