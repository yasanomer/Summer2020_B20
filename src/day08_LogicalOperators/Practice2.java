package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        String firstName = "Khabib";
        String lastName = "Legend";
        int age = 18;
        String citizen1 = "Russia";
        String citizen2 = "USA";

        boolean eligibleAge = age >=18;
        boolean usCitizen = citizen1 == "USA"  || citizen2 == "USA";
        //                  Russie == USA      ||   USA == USA
        //                  false              ||  true
        // true
        boolean eligibleToVote = eligibleAge && usCitizen;

        String fullName = firstName +" "+ lastName;
        System.out.println(fullName + " is elegible to vote for Trump :"+ eligibleToVote);
    }
}
