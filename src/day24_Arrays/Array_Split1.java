package day24_Arrays;

import java.util.Arrays;

public class Array_Split1 {
    public static void main(String[] args) {
        String email = "myfancy@gmail.com";

        String str = email.replace("@" ," @ " );
        String [] words = str.split(" ");
//        System.out.println(Arrays.toString(words));
        int count = 0;

        for (String each : words){
            if (each.toLowerCase().contains("@")) {
                count++;
            }
        }
//        System.out.println("@ :" +count);
        if (count==1){
            int i1 = str.indexOf("@");
//            System.out.println(str.charAt(i1));
            String str1 = email.substring(0,i1-2);
            String str2 =email.substring(i1);
            System.out.println("Email id: "+str1);
            System.out.println("Email domain: "+str2);
        }else
            System.out.println("invalid email");

    }
}




