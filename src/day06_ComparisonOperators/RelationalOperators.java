package day06_ComparisonOperators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean r1 = 10 >9;
        System.out.println(r1);

        boolean r2 = 100 < 9000;
        System.out.println(r2);

        // >= greater than
       boolean r3 = 87 >= 85 ;
        System.out.println(r3);

        boolean r4 = 877 >= 878;
        System.out.println(r4);

        // <= less than
        boolean r5 = 200 <= 300;
        System.out.println(r5   );

        // == ; equal
        boolean r6 = 900 == 800;
        System.out.println(r6);

        boolean r7 = true == false;
        System.out.println(r7);

        boolean r8 = "Muhtar" == "Good guy";
        System.out.println(r8);
        // boolean r10 = "123" == 123;
        boolean r9 = "Apple" != "Orange";
        System.out.println(r9);

        boolean r11 = "Muhtar" != "Bad Guy";
        System.out.println(r11);
        boolean r12 = true != false;
        System.out.println(r12);

        boolean result1 = 'A' == 65;
        System.out.println(result1);

        boolean result2 = 100 == 100.0 ; // $100  $100/0
        System.out.println(result2);

        boolean result3 = 'A'== 65;
        System.out.println(result3);

        boolean result4 ="100"=="100.0";
        System.out.println(result4);

        System.out.println("===========");

        int number = 100;
        boolean even = number%2 == 0;
        System.out.println(number);


    }
}
