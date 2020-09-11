package day08_LogicalOperators;

public class Odd_Even {
    public static void main(String[] args) {
        int number = 313;
        boolean even = (number % 2) == 0;
        boolean odd =!even;
        if (even) System.out.println(number + " Is number even");
        if (odd){
            System.out.println(number+ " Is number odd");
        }
    }

}
