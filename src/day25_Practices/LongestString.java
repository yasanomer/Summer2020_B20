package day25_Practices;

public class LongestString {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Omer","Massimo Ephesus"};

        int maxLength = arr[0].length(); //3

        for (String each : arr) {  // to find out the minimum lenght of the string in arr

            if (each.length() > maxLength) {
                maxLength = each.length();
            }
        }

        for (String each : arr) {  // to see how many strings' lengths in the array is matching with minLength
            if (each.length() == maxLength) {
                System.out.println(each);


            }
        }
    }
}
