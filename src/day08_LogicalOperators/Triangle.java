package day08_LogicalOperators;

public class Triangle {
    public static void main(String[] args) {
        double angles1 = 100 ;
        double angles2 = 60 ;
        double angles3 = 20 ;
        boolean valid = angles1 + angles2 + angles3 == 180 ;
        boolean invalid = !valid;
        if (valid) {
            System.out.println( "Valid Triangle");
        }
        if (invalid){
            System.out.println("Invalid Triangle");
        }
    }
}
