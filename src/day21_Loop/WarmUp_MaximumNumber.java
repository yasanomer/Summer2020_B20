package day21_Loop;
        /*
          1. write a program that asks user to enter
           5 numbers and retuns the maximum number
         */
import java.util.Scanner;

public class WarmUp_MaximumNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int maxNumber = -2147483648;
      for (int i=1; i<=5 ;i++){
          System.out.println("Enter number:");
          int num =s.nextInt();
          if (num>maxNumber){
              maxNumber=num;
          }

        }
        System.out.println("Maximum Number is :"+maxNumber);

    }
}
