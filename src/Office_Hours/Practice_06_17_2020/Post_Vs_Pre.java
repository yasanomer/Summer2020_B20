package Office_Hours.Practice_06_17_2020;

public class Post_Vs_Pre {
    public static void main(String[] args) {
        int a = 300;
        System.out.println(++a);// a = 301  pre increment
        System.out.println(++a);// a = 302

        int b = 50;
        System.out.println(--b); // b = 49 decreases
        System.out.println(--b); // b =48

        System.out.println("============");

        int x = 40;
        System.out.println(x--); // 40
        System.out.println(x); // x = 39
        System.out.println(x--); // x =38

        int y= 60;
        System.out.println(y++); // y = 60
        System.out.println(y); // y =61
        System.out.println(y++); // y = 61


    }
}
