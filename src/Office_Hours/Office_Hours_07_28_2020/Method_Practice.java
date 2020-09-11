package Office_Hours.Office_Hours_07_28_2020;

import java.util.ArrayList;

public class Method_Practice {
    public static void main(String[] args) {

        String str = "massimo";
        String reverseName= reverseStr(str);
        System.out.println(reverseStr(str));
        System.out.println(reverseName);
        System.out.println(reverseName.toUpperCase());

        palindrome("omer");
        palindrome("level");
        System.out.println("=========================");
        String [] names = {"Massimo", "Ephesus","Zeus","EFE"};
        ArrayList<String>nameList = new ArrayList<>();


        for (String each : names){
//            System.out.println(reverseStr(each));
//            palindrome(each);

            nameList.add (reverseStr(each));
        }
        System.out.println(nameList);


    }


    public static String reverseStr (String str) { // "ABC"
        String result = ""; // CBA

        for (int i = str.length() - 1; i >= 0; i--) {
            result+=str.charAt(i); // C B A
        }

            return result;
        }

    public static void palindrome (String str){  //ABC
        String reversedStr= reverseStr(str);       //CBA
        boolean palindrome = str.equalsIgnoreCase(reversedStr); // ==
        System.out.println((palindrome)?str + " Is Palindrome ": str+ " Is not Palindrome ");


    }
}
