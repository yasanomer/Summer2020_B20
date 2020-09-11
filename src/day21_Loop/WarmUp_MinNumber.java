package day21_Loop;
/*
          1. write a program that asks user to enter
           5 numbers and retuns the minimum number
 */
import java.util.Scanner;

public class WarmUp_MinNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int minNumber = 999999999;
        int i = 1;
        while (i <= 5){
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if (minNumber > num)
                minNumber = num;
            i++;
        } System.out.println("Minumum number :"+ minNumber);
    }
}
