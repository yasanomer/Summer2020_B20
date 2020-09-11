package Office_Hours;

import java.util.Scanner;

public class Fruquency_Word {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your sentence :");
        String word =s.nextLine();
        int count = 0 ;

        while (word.contains("yes")){
            count ++;
           word= word.replaceFirst("yes","");

        }
        System.out.println(count);
    }
}
