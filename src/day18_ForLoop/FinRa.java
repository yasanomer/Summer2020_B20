package day18_ForLoop;

import java.util.Scanner;

public class FinRa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = s.nextInt();

        for (int i = 1; i <= number; i++) {
             if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA"+" ");
            } else if (i % 3 == 0) {
                System.out.print("FIN"+" ");
            } else if (i % 5 == 0) {
                System.out.print("RA"+" ");

             }else
                System.out.print(i+" ");
        }

    }
}
