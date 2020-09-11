package day07_Unary_ShortHand;

public class Task {
    public static void main(String[] args) {

        int x = 2;
        int y = x++;
        System.out.println(y);
        System.out.println(x++);
        System.out.println(--x);
        System.out.println(x);

        int z = 8;
        int f = z--;
        System.out.println(f);
        System.out.println(z);

//        int a = 1 ;
//        int a = -a-- + a++ / -a-- * --a;
//        System.out.println(a);

    }
}
