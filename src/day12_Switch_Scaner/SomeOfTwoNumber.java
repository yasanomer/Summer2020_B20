package day12_Switch_Scaner;

import java.util.Scanner;

public class SomeOfTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your first number:");
        int num1 = scan.nextInt();
        System.out.println(" Enter your second number:");
        int num2 = scan.nextInt();
        System.out.println("The sum of those two number");
        int sum = num1+num2;
        System.out.println(sum);
        System.out.println("The sum of those two number"+num1+num2);



    }
}
