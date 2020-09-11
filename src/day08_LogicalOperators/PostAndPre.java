package day08_LogicalOperators;
/*
3. manually calculate the following code fragements:
				1. int a = 200;
					int b = -a++ + - --a * a-- % 2
					b = ?

				2. int x = 300;
				   int y = 400;
				   int z = x + y - x * y +x / y;
 */
public class PostAndPre {
    public static void main(String[] args) {
        int a = 200;
         int b = -a++ + - --a * a-- % 2;
         // b= -200 - 200 * 200 % 2 // a= 199
         // b= -200 - 200 * 0
         // b = -200 - 0
        // b = -200
        System.out.println(b);
        System.out.println(a);

        int x = 300;
        int y = 400;
        int z = x + y - x *y +x / y ;
        //  z = 300 + 400 -300 * 400 +300 /400
        //  z = 300 + 400 - 120000 + 0 (int 0.75 = 0)
        //  z = -119300
        System.out.println(z);
    }
}
