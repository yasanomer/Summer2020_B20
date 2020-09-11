package day48_Inheritance.Phones;

import java.util.ArrayList;
import java.util.Arrays;

public class phoneObjects {
    public static void main(String[] args) {

   iPhone iPhone1 = new iPhone("x",800,"11,5");
   Nokia  nokia1 = new Nokia("3310",400,"5.6");
   Samsung samsung1 =new Samsung("S10",600,"5.7") ;
   iPhone iPhone2 = new iPhone("11",600,"8.6");

        System.out.println(iPhone1);
        System.out.println("=========");
        System.out.println(iPhone1.price);
       iPhone1.text(678994049);
       iPhone1.call(79069797);
        System.out.println(iPhone1.model);

        ArrayList<iPhone> iPhones = new ArrayList<>();
        iPhones.addAll(Arrays.asList(iPhone1,iPhone2));
        System.out.println(iPhones);
        ArrayList<Phone> phones = new ArrayList<>();
        phones.addAll(iPhones);
        System.out.println("========>");
        System.out.println(phones);

        phones.addAll(Arrays.asList(nokia1,samsung1));
        System.out.println(phones.size());

    }
}
