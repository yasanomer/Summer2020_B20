package day20_WhileLoops;

import java.util.Scanner;

/*
Write a program that calculates the sum of numbers entered by the user until
user enters a negative number.
			hint: you need an infinite loop
 */
public class infinity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println(" Enter your infinite number :");

        int sum =0;
        for (int i=0; i==0; ){

            System.out.println("Enter a number:");
           int num =  s.nextInt();

           if (num<0){
               break;
           }
           sum +=num;
        }

        System.out.println("sum is :"+sum);

    }
}
