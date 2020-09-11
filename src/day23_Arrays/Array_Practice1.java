package day23_Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {
      //  String students = " Massimo","Muhtar","Asiya"  mistake junt one name valid.

        String [] students = {"Cybertek", "Muhtar" , "Nadir", "Kuzat","Massimo"};

        String name1 = students[4];
        System.out.println(name1);
        System.out.println("===========");


        int [] scores = { 85 , 70 , 90 , 95 , 100 };
        String [] name = {"Mike" , "Adam" , "Massimo" , "John" , "Amy"};
/*
        System.out.println( name [0] + ":" + scores [0]);
        System.out.println( name [1] + ":" + scores [1]);
        System.out.println( name [2] + ":" + scores [2]);
        System.out.println( name [3] + ":" + scores [3]);
        System.out.println( name [4] + ":" + scores [4]);

 */

        for (int i=0 ; i<=4 ; i++){
            System.out.println( name [i] + ":" + scores [i]);
        }
        System.out.println("=====================");
        String [] classMate = new String[5]; // size is 5,
        classMate [0] = "Jose";
        classMate [1] = "Selman";
        classMate [2] = "Victor";
        classMate [3] = "Isa";
        classMate [4] = "Nil";

        for (int i =0 ; i<=classMate.length-1 ; i++){
            System.out.println(classMate[i]);

        }




        // lenght : returns the size

    }
}
