package org.example;

import java.util.List;

public class Formule {
    public static Double minimum(List<Double> lista){
        double min=lista.get(0);
        for(Double x:lista){
            if(x<min) min=x;
        }
        return min;
    }

    public static Double maksimum(List<Double> lista){
        double max=lista.get(0);
        for(Double x:lista){
            if(x>max) max=x;
        }
        return max;
    }

    public static Double srednjaVrijednost(List<Double> lista){
        double suma=0;
        for(Double x:lista){
            suma=suma+x;
        }
        return suma/lista.size();
    }
    public static Double standardnaDevijacija(List<Double> lista){
        Double srVrijednost=srednjaVrijednost(lista);
        Double standDev=0.0;
        for(Double x:lista)
        {
            standDev+=Math.pow(x-srVrijednost,2);
        }
        return Math.sqrt(standDev/lista.size());
    }
}
