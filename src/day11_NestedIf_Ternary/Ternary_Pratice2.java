package day11_NestedIf_Ternary;

public class Ternary_Pratice2 {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);

        System.out.println("===========");

        String result2 = (num > 0) ? "Positive" : (num < 0)? "Negative" : "Zero";
        System.out.println(result2);
        System.out.println("===========");
         /*
            write a program that can compare two number
                a = 10, b= 20
               output:  b is greater
               a = 30, b = 10;
               output: a is greater
               a = 20; b= 20;
               output: a is equal to b
         */
        int a=20;
        int b=20;
        String result3 = (b>a)? "b is greater" : (a>b)? "a is greater":"a is equal to b";
        System.out.println(result3);
    }
}
