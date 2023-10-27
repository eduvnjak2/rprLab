package org.example;

public class faktorijel {
    public static int faktorijel(int n){
        int faktorijel=1;
        if(n==1 || n==0) return 1;
        else{
            for(int i=1;i<=n;i++){
                faktorijel*=i;
            }
            return faktorijel;
        }
    }
}
