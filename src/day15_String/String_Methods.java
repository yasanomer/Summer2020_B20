package day15_String;

public class String_Methods {
    public static void main(String[] args) {
        String name = "orange";
        //             01234567

        // charAt(index):
        char ch1 = name.charAt(0); //'C'
        char ch2 = name.charAt(5); //'t'
        System.out.println(ch1);
        System.out.println(ch2);

        // lenght() ==> int
        int l= name.length();
        System.out.println(l);

        //last index: lenght of strng-1
        int lastIndexNumber = name.length()-1;
        System.out.println(lastIndexNumber);

        // char lastChar = name.charAt(5);
        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        //concat (Str): concatenation
        String schoolName= "Cybertek";
        schoolName=schoolName.concat("School");
        System.out.println(schoolName);

        String r1 = "Cybertek" + 123 + 'A'+true;
        System.out.println(r1);

        //toLowerCase():
        String name1 = "CYBERTEK SCHOOL";
        name1 = name1.toLowerCase();
        System.out.println(name1);

        //toUpperCase();
        String name2 = "omer";
        name2= name2.toUpperCase();
        System.out.println(name2);

        // trim ():
        String p = " Cybertek    School   ";
        p = p.trim();
        System.out.println(p);


















        }

    }


