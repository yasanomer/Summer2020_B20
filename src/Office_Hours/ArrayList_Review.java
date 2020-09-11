package Office_Hours;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Review {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);

        int [] nums1 = {80,90,100};
        Integer []nums = {80,90,100};
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.addAll(Arrays.asList(50,60,70));
        list2.addAll(Arrays.asList(nums));

        System.out.println(list2);
    }
}
