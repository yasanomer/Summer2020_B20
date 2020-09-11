package day18_ForLoop;

import javax.swing.*;
import java.util.Scanner;

/*
write a program that can calculate the sum of all numbers between 1 to
intany given number
        ex:
            input: 100
            output: 5050

            input: 50
            output: 1275

            input : 200
            output : 20100

 */
public class SumOfNums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your number :");
        int number = s.nextInt();
        int sum = 0;
        if (number > 1) {
            for (int num = 0; num <= number; num++) {
                sum += num;
            }
            System.out.println(sum);
        } else
        System.out.println("Invalid Entry");

    }

}
