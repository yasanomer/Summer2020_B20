package day14_Recap;
/*
task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */
import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your gender:");
        String gender = input.next();

        System.out.println("Enter your Age:");
        int age = input.nextInt();

        System.out.println("Enter your Country name :");
        String countryName= input.next();

        System.out.println("Enter your zipcode:");
        int zipcode = input.nextInt();

        System.out.println("Enter your Full name :");
        String fullName = input.nextLine();
        input.nextLine();

        System.out.println("Enter your company name:");
        String companyName = input.nextLine();





    }

}
