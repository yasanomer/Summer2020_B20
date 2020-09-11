package day47_Encapsulation;

/*
2. create a class called CapitalOneEmployees
				instance variables:
						employeeName
						employeeAge
						jobTitle
					private	ID
					private salary
					private address

					company name = "Capital One"

					generate getters & setters for private variables
 */
public class CapitalOneEmployees {
    public String employeeName;
    public int employeeAge;
    public String jobTitle;

    private int ID;
    private double salary;
    private String address;

    public static String companyName;
    static {
        companyName = "Capital One";
    }
    public CapitalOneEmployees (String employeeName, int employeeAge,String jobTitle) {
        this.employeeName = employeeName;
        this.employeeAge  = employeeAge;
        this.jobTitle = jobTitle;
    }

    public void setID (int ID){
        this.ID= ID;
    }
    public void setSalary (double salary){
        this.salary= salary;
    }
    public void setAddress (String address){
        this.address=address;
    }

    public int getID(){
        return  ID;
    }
    public double getSalary (){
        return salary;
    }
    public String getAddress (){
        return address;
    }

    public String  toString (){
        return "Name: "+employeeName+"\nAge :"+employeeAge+"\nJob Title :"+jobTitle+"\nID : "+getID()+"\nSalary : "+getSalary()+"\nAddress : "+getAddress();
    }







}
