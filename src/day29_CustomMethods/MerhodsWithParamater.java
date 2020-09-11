package day29_CustomMethods;

import java.util.Scanner;

public class MerhodsWithParamater {
    public static void main(String[] args) {

        printHello(5);
        System.out.println("===================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter birth year and current year");
        age(1973,2020) ;

    }




    public static void printHello(int numberOfTimes){

        for (int i=0 ;i <numberOfTimes ; i++){
            System.out.println("Hello World");
        }
    }

    public static void age (int birthYear,int currentYear){


        int age =currentYear- birthYear;
        System.out.println("Your are "+age+" years old");
    }

}
