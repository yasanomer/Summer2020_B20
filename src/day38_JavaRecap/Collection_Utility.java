package day38_JavaRecap;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Collection_Utility {


    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R','V','F','L','K','Q','A','B'));
        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<String > studets = new ArrayList<>();
        studets.addAll(Arrays.asList("Massimo","Omer","Cihan","Nurullah","Cristina"));
        //                               0        1      2          3          4
        System.out.println(studets);

        Collections.swap(studets,1,0);
        System.out.println(studets);
        Collections.swap(studets,0,studets.size()-1);
        System.out.println(studets);

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Coffee","Coffee","Eggs","Battery","Battery","Battery","Battery" ));

       int count = Collections.frequency(items,"Battery");

        System.out.println(count);

        ArrayList<String > unique = new ArrayList<>();

        for (String each : items){
            int i= Collections.frequency(items,each);
            if (i ==1 ){
                unique.add(each);
            }
        }
        System.out.println(unique);

        ArrayList<String > unique2 = new ArrayList<>();
        unique2.addAll(items);
        unique2.removeIf(p -> Collections.frequency(unique2,p)>1);
        System.out.println(unique2);


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(40,90,100,150,250,25,50));
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max:" + max);
        System.out.println("min:" + min);

        Collections.replaceAll(list,100,100000);
        System.out.println(list);


    }


}
