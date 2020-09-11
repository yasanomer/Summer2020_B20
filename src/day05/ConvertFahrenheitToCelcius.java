package day05;

public class ConvertFahrenheitToCelcius {
    public static void main(String[] args) {
        int c = 23;
        double f = (9 * c/5)+32;
        System.out.println(c+" Celsius: " +f+ " Fahrenheit");

        int f1 =2;
        double c2 = (f1-32)* 5/9;
        System.out.println(f1+" Fahrenheit : "+c2+ "Celsius");
    }


}
