package day10_ifStattements;

public class If_witoutCurlyBraces {
    public static void main(String[] args) {
        if (9>10);{
            System.out.println("Hello");
            System.out.println("How are you");
        }
        System.out.println("==========");

        if (9>10){
            System.out.println("Hello");
        }
        System.out.println("==========");

        int num = 101;
        if (num%2==0)
            System.out.println(num+" is even Number");
        else
            System.out.println(num+ " is odd Number");
    }
}
