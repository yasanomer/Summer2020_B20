package day07_Unary_ShortHand;

public class task3 {
    public static void main(String[] args) {
        int a=1;
        a = -a-- + a++ / -a-- * --a;
        // a = -1  +  0 / -1 * -1

        System.out.println(a);
    int b= 50;
    // b = 50 + 49 + 48 + 49
        b = --b+ b++ + b-- + b++;
        System.out.println(b);
    int x  = 4 ;
    int y = x * 4 - x--;
        System.out.println(y);
    }
}
