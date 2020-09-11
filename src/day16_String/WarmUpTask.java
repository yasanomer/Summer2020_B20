package day16_String;
/*
Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        // extra task:
        String str = "I like to drink Pepsi";
        String drink = str.substring(16);
        System.out.println(drink);

        String action = str.substring(10, 14 + 1);
        System.out.println(action);


        Scanner input =new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();

        // String result =   str1.substring(1).concat(  str2.substring(1)   );
        String res = word1.substring(1)+word2.substring(1);

        System.out.println(res);




    }
}
