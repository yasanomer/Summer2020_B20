package day13_Scanner;

import java.util.Scanner;

public class nexline_VS_nextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();



        // use this to take out the Enters that are left in the scanner.
        // so that we can use the next enter
        System.out.println("Enter your full name: ");
        String fullName= scan.nextLine();

        System.out.println("Salary; "+ salary);
        System.out.println("Full name: "+fullName);

    }
}

