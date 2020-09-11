package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100,90,85,75,91,55,45,73,73,35,47,60,57,47,67,47,57,67,87,77,53,63,65));

        System.out.println(list.toString());

        ArrayList<Integer> gradeA = new ArrayList<>();// 90~100
        gradeA.addAll (list);
        gradeA.removeIf(each -> each <90 );
        System.out.println("Grade A:"+ gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>();
        gradeB.addAll (list);
        gradeB.removeIf(p -> p<80 || p>89);
        System.out.println("Grade B:"+ gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>();
        gradeC.addAll (list);
        gradeC.removeIf(p -> p<70 || p>79 );
        System.out.println("Grade C:"+ gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll (list);
        gradeD.removeIf(p -> p<60 || p>69);
        System.out.println("Grade D:"+ gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll (list);
        gradeF.removeIf(p -> p>59);
        System.out.println("Grade F:"+ gradeF);

        System.out.println("===============");
        System.out.println(gradeA.size()+" students made A");
        System.out.println(gradeB.size()+" students made B");
        System.out.println(gradeC.size()+" students made C");
        System.out.println(gradeD.size()+" students made D");
        System.out.println(gradeF.size()+" students failed");



    }

}
