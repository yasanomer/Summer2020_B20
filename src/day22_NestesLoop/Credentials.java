package day22_NestesLoop;

import java.util.Scanner;

/*
username: cyber
password: tek123
 */
public class Credentials {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your user name :");
        String u = s.next();

        System.out.println("Enter your password :");
        String p = s.next();

        int attempt =2;

        while ( ! (u.equals("cyber") && p.equals("tek123")) ){
            if (attempt==3){
                System.out.println("Your account is locked ");
                System.exit(0);
            }
            System.out.println(" Invalid user name or password. Please re-enter");
            System.out.println("Enter your user name :");
            u = s.next();


            System.out.println("Enter your password :");
             p = s.next();

            attempt++;
        }

        System.out.println("Logged in");
    }
}
