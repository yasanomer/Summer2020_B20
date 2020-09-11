package day09;

import java.sql.SQLOutput;

public class Maximum {
    public static void main(String[] args) {
        double a = 500 ;
        double b = 200 ;
        double c = 600;
        boolean aIsMax= a>b && a>c;
        boolean bIsMAx= b>a && b>c;
      //  boolean bIsMax= aIsMax == false && b>c;
        boolean cIsMAx= c>a && c>b;
        boolean cIsMax= aIsMax==false && bIsMAx==false;
       // boolean cIsMax= !aIsMax && !bIsMAx;

        double max = 500000000;// we want to assing the maximum number to variable max


        if (aIsMax){
            //System.out.println(a);
            max = a;
        }
        if (bIsMAx){
          //  System.out.println(b);
            max= b;
        }
        if (cIsMAx){
           // System.out.println(c);
            max = c;
        }
        System.out.println(max+ " is maximum number");
    }
}
