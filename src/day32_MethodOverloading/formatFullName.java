package day32_MethodOverloading;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class formatFullName {
    /*
     write a method that can retunr the full name of a person in reugral format

			ex:
				fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();

/*
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
              // Convert firstName char to upper case  // convert rest of chars to lowers

        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        String fullName = firstName+ " "+ lastName;
     
        System.out.println(fullName);

 */
        String fullName = formatFullName(firstName , lastName);

        System.out.println(fullName);



    }
    
    public static String formatFullName (String firstName, String lastName){
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        String fullName = firstName+ " "+ lastName;


        return fullName;
    }
    
}
