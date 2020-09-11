package day20_WhileLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter your number:");
        int num= s.nextInt();

        long f =1;
        for (int i=num; i>=1; i--) {
            f*=i;
        }
        System.out.println(f);



    }
}
