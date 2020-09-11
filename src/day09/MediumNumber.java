package day09;

public class MediumNumber {
    public static void main(String[] args) {
        double a = 40;
        double b = 20;
        double c = 30;
        boolean aIsMed = (a>b && a<c) || (a>c && a<b);
        boolean bIsMed = (b>c && b<a) || (b>a && b<c);
        boolean cIsMed = !aIsMed && !bIsMed ;
        double med = 0;
        if (aIsMed){
            med = a;
        }
        if (bIsMed){
            med = b;
        }
        if (cIsMed){
            med = c;
        }
        System.out.println(med+ " is the medium number");
    }
}
