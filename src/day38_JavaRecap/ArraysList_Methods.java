package day38_JavaRecap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_Methods {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Mercedes","Jeep","Tesla","WV","Massarati","Lexus","Tesla","Mazda"));
                                //  0       1         2      3      4       5         6
//        cars.remove(3);
//        cars.remove("Tesla");
//        cars.removeAll(Arrays.asList("Tesla"));
//        cars.removeIf(p -> p.toLowerCase().contains("m"));
//        cars.retainAll(Arrays.asList("Tesla"));
        System.out.println(cars);
        System.out.println("==========================");

        ArrayList<String > groceryList = new ArrayList<>();

        groceryList.addAll(Arrays.asList("Eggs", "Milk","Pepsi","Paper Towels","Orange","Avocado"));

        boolean r1 = groceryList.contains("Pepsi");
        System.out.println(groceryList);
        System.out.println(r1);
        // Water
        boolean r2 =groceryList.contains("Water");
        System.out.println(r2);
        // Milk, Eggs
        boolean r3 = groceryList.containsAll(Arrays.asList("Eggs", "Milk"));
        System.out.println(r3);

        System.out.println("Total Number of Items: "+ groceryList.size());

        groceryList.set(groceryList.size()-1,"Apple");
        groceryList.set(groceryList.indexOf("Paper Towels"), "Dish Washer" );

        System.out.println(groceryList);

    }

}
