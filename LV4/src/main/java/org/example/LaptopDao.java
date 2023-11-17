package org.example;

import java.io.IOException;
import java.util.ArrayList;

interface LaptopDao {
    void dodajLaptopUListu(Laptop laptop);
    Laptop dodajLaptopUFile(Laptop laptop) throws IOException;
    Laptop getLaptop(String procesor);
    void napuniListu(ArrayList<Laptop> laptopi);
    ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException, ClassNotFoundException;
}
