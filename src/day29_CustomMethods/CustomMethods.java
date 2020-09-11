package day29_CustomMethods;

public class CustomMethods {
    public static void removeDup(String str){
        String nonDup = "";
        for (String each : str.split("")){
            if (!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        System.out.println(nonDup);
    }



    public static void reverse (String str){
        String result = "";
        for (int i=str.length()-1;i>=0 ; i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }


    public static void maxNum (int [] arr){
        int max = arr [0];

        for (int each : arr){
            if (each>max){
                max = each;
            }
        }
        System.out.println("Maximum number :"+max);

    }


    public static void minNum (int [] arr){
        int min = arr [0];

        for (int each : arr){
            if (each<min){
                min = each;
            }
        }
        System.out.println("Minimum number :"+min);

    }

}
