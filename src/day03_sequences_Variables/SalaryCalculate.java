package day03_sequences_Variables;
/*
totalTax=salary*tax;
salaryAfterTax= salary - totalTax
 */


public class SalaryCalculate {
    public static void main(String [] args){
        double salary = 100000.0;
        double tax = 0.28;

        double totalTax = salary*tax;
        double salaryAfterTax =salary-totalTax;
        System.out.println(salaryAfterTax );

    }
}
