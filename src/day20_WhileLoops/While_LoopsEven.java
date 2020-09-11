package day20_WhileLoops;

public class While_LoopsEven {
    public static void main(String[] args) {

        for(int i=80; i>=20; i--){
            if(i==i/2){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        int i=80;
        while(i>=20){
            if(i%2==0){
                System.out.print(i+" ");
            }


            i--;
        }



    }
}
