package day06_ComparisonOperators;

public class SalaryCalculater {
    public static void main(String[] args) {

        double rate = 55;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.22;
        int weeklyhours = 48 ;

        double salary = rate * weeklyhours* 48;
        double totalTax = salary * (stateTaxRate+federalTaxRate);
        double afterTaxSalary = salary - totalTax;
        System.out.println("Salary before Tax : "+salary+ "USD");
        System.out.println("Total tax : "+totalTax);
        System.out.println("Salary After Tax : "+afterTaxSalary+ " USD");

    }
}
