package Office_Hours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));

        Collections.swap(list1,0,1);
        System.out.println(list1);
        Collections.swap(list1, list1.size()-2,list1.size()-1);
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

//        int max = Collections.max(list1);
        Integer max = Collections.max(list1);
        Integer min = Collections.min(list1);

        System.out.println("Maximum Number :"+ max);
        System.out.println("Minimum Number :"+ min);

        System.out.println("===========================");
        String [] arr = {"Eggs","Orange","Milk","Toilet Paper","Toilet Paper","Toilet Paper","Toilet Paper","Avocado"};

        ArrayList<String> item = new ArrayList<>();
        item.addAll(Arrays.asList(arr));
        System.out.println(item);

        int count= Collections.frequency(item,"Toilet Paper");
        System.out.println(count);

        item.removeIf(I -> Collections.frequency(item,I) !=1);

        System.out.println(item);

    }
}
