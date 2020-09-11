package day32_MethodOverloading;


import java.util.Scanner;

public class Calculator {
    /*
    write a method that can add element to an array, the method accepts an array and and a number, then returns the new array by appending the number to the last index of the given array

	Ex:
			int[] arr = {1,2,3};
			int num = 4;

			addElement(arr, num); ===> {1,2,3,4}
			// + , - , * , / , %
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNum = scan.nextDouble();
        System.out.println("Operator: ");
        char operator = scan.next().charAt(0);
        System.out.println("Enter second number: ");
        double secondNum = scan.nextDouble();

        double result = calculator(firstNum,operator,secondNum);

        System.out.println(result);




    }




    public static double calculator (double num1 , char oper , double num2){
        double result = (oper == '+')? num1+num2 : (oper == '-')? num1-num2 : (oper == '*')? num1*num2
                :(oper == '/')? num1/num2 : (oper == '%')? num1%num2 : 0 ;

        return result;
    }



}
