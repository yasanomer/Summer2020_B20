package day11_NestedIf_Ternary;
/*
precondition: minimum salary of 30k
                sub condition: minimum 2 years of job history
 */
public class NestedIf_Practice1 {
    public static void main(String[] args) {
        double salary = 120000;
        double jobHistory = 0.5;


        if (salary >=30000){
            if (jobHistory>=2){
                System.out.println("You are qualified");
            }else {
                System.out.println("You Must at least 2 year");
            }

        }else {
            System.out.println("You Must earn at least $30K");
        }

    }
}
