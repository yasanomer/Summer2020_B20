package day11_NestedIf_Ternary;
/*
1. write a java program that can convert numbers between 0 ~ 9 to words,
if the number is greater than 9 or less than zero, out put should be "Invalid".
 */
public class NumberToWords {
    public static void main(String[] args) {
        int num = 1;

        String result="";
    if (num==0){
        result = "zero";
    }else if (num==1){
            result = "one";
    }else if (num==2){
            result = "two";
    }else if (num==3){
            result = "three";
    }else if (num==4){
            result = "four";
    }else if (num==5){
            result = "five";
    }else if (num==6){
            result = "six";
    }else if (num==7){
            result = "seven";
    }else if (num==8){
            result = "eight";
    }else if (num==9){
            result = "nine";
//    }else if (num<0 || num>9){
//        result = "Invalid";
    } else {
            result = "Invalid";
        }
        System.out.println(result);
        System.out.println("================");
        // ternary solution
        String result1 =(num==0)?"zero" :(num==1)?"one" :(num==2)?"two":(num==3)?"three":(num==4)?"four":(num==5)?"five"
        :(num==6)?"six":(num==7)?"seven":(num==8)?"eight":(num==9)?"nine":"Invalid";
        System.out.println(result1);
    }
}
