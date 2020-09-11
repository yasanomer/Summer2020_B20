package day34_WrapperClasses;

public class WrapperClass_Methods {
    public static void main(String[] args) {

        String str = "123";
        int a = Integer.parseInt(str); // 123

        System.out.println(str + 1); //1231
        System.out.println(a + 1); // 124

        Double d1 = Double.parseDouble("7.5");
        System.out.println(d1-1); // 6.5

        String b = "TRUE";
        boolean b1 = Boolean.parseBoolean(b);
        System.out.println(b1);
        System.out.println("=========================");

        String s2 = "10000.5";
        double d2 = Double.valueOf(s2);  // unboxing
        System.out.println(d2 *2);

        String s3 = "False";
        boolean r2 = Boolean.valueOf(s3);
        System.out.println(r2);


    }
}