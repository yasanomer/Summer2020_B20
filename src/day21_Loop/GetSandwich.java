package day21_Loop;

import javax.xml.namespace.QName;

public class GetSandwich {
    public static void main(String[] args) {

        String str = "xxbreadyy";
        //     xx- -jam -yy
        String word = "";

        if (str.contains("bread")) {
            int firstIndex = str.indexOf("bread");
            int lastIndex = str.lastIndexOf("bread");
            System.out.println(firstIndex);
            System.out.println(lastIndex);


            if (firstIndex == lastIndex) {
                System.out.println("nothing");
            } else {
                System.out.println(str.substring(firstIndex+5,lastIndex));
            }
        } else {
            System.out.println("nothing");
        }
    }
}
