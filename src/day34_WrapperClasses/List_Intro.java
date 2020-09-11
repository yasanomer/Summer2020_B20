package day34_WrapperClasses;
import java.util.ArrayList;
public class List_Intro {
    public static void main(String[] args) {
        ArrayList <Integer> scores = new ArrayList<>();
        scores.add(95); // autoBoxing 0
        scores.add(100);// 1
        scores.add(85); // 2
        scores.add(75); // 3
        scores.add(1,65);
        scores.add(25);
        scores.add(6,30);

        System.out.println(scores);

        // 100 out
        System.out.println(scores.get(2));

        System.out.println(scores.size());



    }

}
