package day29_CustomMethods;

/*
write a method that can remeove the duplicates from the string
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "fgjkkagfddjiuxdahgrasravscr";
        removeDup(str);

    }



    public static void removeDup(String str){
        String nonDup = "";
        for (String each : str.split("")){
            if (!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        System.out.println(nonDup);
    }


}
