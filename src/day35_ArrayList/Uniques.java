package day35_ArrayList;

import java.util.ArrayList;

public class Uniques {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

      list.add(1);
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(3);
      list.add(4);
      list.add(5);

            for(int element : list ){
                int count = 0 ;
                for(int b : list){
                    if(element == b){
                        count++;
                    }
                }

                if(count == 1){
                    System.out.print(element+" ");
                }
            }

            System.out.println();

        }


    }


