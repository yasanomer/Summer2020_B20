package day11_NestedIf_Ternary;

public class DaysInMonth2 {
    public static void main(String[] args) {
        int month =1;
        boolean validNumber = month >=1 && month <=12;
        boolean days28 = month ==0; // for the months that has 28 days
        boolean days30 = month ==4 || month ==6 || month==9 || month == 11;
        boolean invalid = month <1 || month>12;

        String result = "";
        if (validNumber){
            if (days28){
                result="28 Days";
            }else if (days30){
                result="30 Days";
            }else {
                result="31 Days";
            }

        }else {
            result= "Invalid";
        }
        System.out.println(result);
    }

}
