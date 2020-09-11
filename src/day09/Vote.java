package day09;

public class Vote {
    public static void main(String[] args) {
        int age = 24;
        boolean usCitizen = true;

        if (age>=18 && usCitizen){
            System.out.println(" Eligible to vote for trump");
        }else {
            System.out.println("Not eligible to vote for Trump");
        }
    }
}
