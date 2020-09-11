package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        String firstName= "Aaron";
        String lastName = " Daniel";
        String fullName = firstName+lastName;
        int age = 19;
        String citizenShip = "USA";
        boolean eligibleToVote= age>=18 && citizenShip == "USA";
        //                    = 19 >= 18 && "USA" == "USA"
        //                      true &&  true
        System.out.println(fullName + " is eligible to vote : " + eligibleToVote);



    }
}
