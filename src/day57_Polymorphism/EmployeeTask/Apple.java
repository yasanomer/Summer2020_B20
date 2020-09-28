package day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {

        Employee tester1 = new Tester("Andrii",516875,"QA",120000,'M');
        Employee tester2 = new Tester("Musa Moylam", 123456, "SDET", 130000, 'M');
        Employee tester3 = new Tester("Massimo",4057721,"QA",155.000,'M');
        Employee tester4 = new Tester("Ivana",232323,"Automation QA",160.000,'F');

        Employee developer1 = new Developer("Hajar", 12098, "Team lead", 12000, 'F');
        Employee developer2 = new Developer("Abdul",123456789,"Developer",110000,'M');
        Employee developer3 = new Developer("Mehdi",434343,"Developer",146000,'M');

        Employee scrumMaster1 = new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M');

        //   scrumTeam
        ArrayList<Employee> scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1, tester2,tester3,tester4, developer1, developer2,developer3,scrumMaster1) );

        for( Employee each  : scrumTeam ){
            System.out.println(each);
        }


    }
}


