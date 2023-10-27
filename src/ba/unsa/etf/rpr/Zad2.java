package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Unesite broj: ");
    int broj= scanner.nextInt();
    for(int i=1;i<broj;i++)
    {
      if(DjeljivSumomCifara(i)) System.out.println(i);
    }
    }
    private static boolean DjeljivSumomCifara(int broj)
    {
        int suma=SumaCifara(broj);
        return broj%suma==0;
    }
    private static int SumaCifara(int broj)
    {
        int suma=0;
        while(broj>0)
        {
            suma+=broj%10;
            broj/=10;
        }
        return suma;
    }
    }
