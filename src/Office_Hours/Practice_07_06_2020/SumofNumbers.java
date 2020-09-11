package Office_Hours.Practice_07_06_2020;

import java.util.Scanner;

/*
write a program that can ask the user enter a number
for five times and the returns the sum of those five numbers
 */
public class SumofNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum=0;

        for (int i=10 ; i<=5 ;i+=1){

            System.out.println("Enter a number:");
            int num =s.nextInt();
            sum +=num;
        }
        System.out.println(sum);
    }
}
