package day08_LogicalOperators;

public class IfStatement {
    public static void main(String[] args) {
        int a = 200;
        int b = 200;
        if (  a >b ) {
            System.out.println( a + " is the maximum number");

        }
        if ( b>a) {
            System.out.println(b + "  is the maximum number");
        }
        if ( a== b){
            System.out.println( "Both are equal");
        }
        System.out.println("================");

        boolean BreakTime= true;
        if (BreakTime == true){
            System.out.println( " Take 15 minutes break !");
        }
        if (BreakTime == false) {
            System.out.println("Keep Studying");
        }
        System.out.println("================");

        boolean Corona = !true;
        if (Corona== true){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more hand sanitizers");
            System.out.println("Social Distance");
            System.out.println("Stay AT home");
        }
        if (Corona==!true)
            System.out.println(" Live Free or Die");

    }
}
