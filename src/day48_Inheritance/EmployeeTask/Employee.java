package day48_Inheritance.EmployeeTask;

public class Employee {
    public String name;
    public String jobTitle;
    public int ID;
    public char gender;
    public double salary;

    public void  setInfo (String name, String jobTitle, int ID, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.gender = gender;
        this.salary = salary;
    }


}
