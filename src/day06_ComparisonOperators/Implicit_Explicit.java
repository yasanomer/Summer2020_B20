package day06_ComparisonOperators;

public class Implicit_Explicit {
    public static void main(String[] args) {

        short s1 = 100;
        long l1 = s1 ; // implicit casting : automatically done

        long l2 = (long)s1;// if we implicit casting


        int I1 = 300;
        double D1 = I1; // 300.0

        System.out.println(D1);

        double D2 = (double) I1;
        System.out.println("==============");
        double d1 = 400.5555;
        int i1= (int)d1;
        System.out.println(i1);
        System.out.println(d1);


        int n1 = 1000;
        byte b1 = (byte)n1;
        System.out.println(b1);

        double m1 = 34.5;
        float f1 = (long)m1;
        System.out.println(f1);

        long r1 = -500;
        int p1 = (short)r1;
        int p2 = (int)r1;
        System.out.println(p1);
        System.out.println(p2);
        }

    }


