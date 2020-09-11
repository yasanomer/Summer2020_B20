package day08_LogicalOperators;
/*
            write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785 gallons
 */
public class LittersToGallons {
    public static void main(String[] args) {
        int litter = 1000;
        double result2 = litter / 3.785;

        System.out.println(litter+ " Litter = " +(int)result2+ " gallon");
    }
}
