package day47_Encapsulation;

public class CapEmployee {
    public static void main(String[] args) {
        CapitalOneEmployees obj1 = new CapitalOneEmployees("Massimo",35,"QA");

      obj1.setID(121212);
      obj1.setSalary(120000);
      obj1.setAddress("Bedford 03110 NH");


        System.out.println("Employee Name: "+obj1.employeeName);
        System.out.println("Employee Age: "+obj1.employeeAge);
        System.out.println("Job Title: "+obj1.jobTitle);

        System.out.println("ID : "+obj1.getID());
        System.out.println("Salary : $"+obj1.getSalary());
        System.out.println("Adress: "+ obj1.getAddress());

        System.out.println("===============");

        System.out.println(obj1);








    }
}
