package day42_Static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Server [] servers = new Server[]{new Server(), new Server(),new Server(),new Server(),new Server(),new Server(),new Server(),new Server(),new Server(),new Server() };
        servers [0].setInfo("Autumn",1101,3.57,true);
        servers [1].setInfo("Shawna",1102,3.57,true);
        servers [2].setInfo("Alissa",1103,3.57,true);
        servers [3].setInfo("Beth",1104,3.57,false);
        servers [4].setInfo("Kim",1105,3.57,false);
        servers [5].setInfo("Brandy",1106,3.57,true);
        servers [6].setInfo("Sofia",1107,3.57,true);
        servers [7].setInfo("Logan",1108,3.57,true);
        servers [8].setInfo("Alex",1109,3.57,true);
        servers [9].setInfo("Massimo",1110,3.57,true);

        restaurant.Servers.addAll(Arrays.asList(servers));

        Chef [] chefs = new Chef[] { new Chef(),new Chef(),new Chef(),new Chef(),new Chef(),new Chef(),new Chef()};
        chefs [0].setInfo("Zeki",1001,35,false);
        chefs [1].setInfo("Richard",1002,45,false);
        chefs [2].setInfo("Cheedem",1003,55,true);
        chefs [3].setInfo("Ali",1004,25,true);
        chefs [4].setInfo("Pearl",1004,19,true);
        chefs [5].setInfo("Ymishka",1005,11,true);
        chefs [6].setInfo("Amanda",1006,10,true);

        restaurant.Chefs.addAll(Arrays.asList(chefs));

        System.out.println(restaurant);

        System.out.println("====================================");

        int costServers=0;
        for (Server each:restaurant.Servers) {
            costServers +=each.hourlyRate;
        }

        int costChefs=0;
        for (Chef each: restaurant.Chefs) {
            costChefs += each.hourlyRate;
        }
        System.out.println("Total cost all employees: $"+costChefs+costServers);

        System.out.println("===============================================");

        ArrayList<Server> fullTimeServers =new ArrayList<>();
        ArrayList<Chef> fullTimeChefs = new ArrayList<>();

        for (Server each:restaurant.Servers) {
            if (each.fullTime){
                fullTimeServers.add(each);
            }
        }

        for (Chef each: restaurant.Chefs) {
         if(each.fullTime){
             fullTimeChefs.add(each);
         }
        }
        System.out.println("there are "+fullTimeChefs.size()+"full time Chefs");
        System.out.println(fullTimeChefs);
        System.out.println("there are "+fullTimeServers.size()+"full time Servers");
        System.out.println(fullTimeServers);

        System.out.println("========================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of stars that your restaurant has: ");
        restaurant.numberOfStars= scan.nextInt();

        switch (restaurant.numberOfStars){

            case 5 :
                if (restaurant.Servers.size()==10 && restaurant.Chefs.size()==6){
                    System.out.println("Up to standard");
                }else {
                    System.out.println("Need to hire more "+ (6- restaurant.Chefs.size())+ " chefs or "+ (10-  restaurant.Servers.size())+ " servers");
                }
            break;
            case 4 :
                if (restaurant.Servers.size()==7 && restaurant.Chefs.size()==3){
                    System.out.println("Up to standard");
                }else {
                    System.out.println("Need to hire more "+ (6- restaurant.Chefs.size())+ " chefs or "+ (7-  restaurant.Servers.size())+ " servers");
                }
                break;
            case 3:
                if (restaurant.Servers.size()==4 && restaurant.Chefs.size()==1){
                    System.out.println("Up to standard");
                }else {
                    System.out.println("Need to hire more "+ (6- restaurant.Chefs.size())+ " chefs or "+ (3-  restaurant.Servers.size())+ " servers");
                }
                break;
        }




    }

}
