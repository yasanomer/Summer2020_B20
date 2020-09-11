package day08_LogicalOperators;

public class GallonsToLitters {
    public static void main(String[] args) {
        double gallon = 12;
        double litters = gallon * 3.785 ;

        System.out.println(gallon+ " Gallon = " +litters+ " litters");
        System.out.println(gallon+ " Gallon = " +(int)litters+ " litters");
    }
}
