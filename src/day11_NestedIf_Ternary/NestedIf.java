package day11_NestedIf_Ternary;
/*
        90~100 ==>A
        80 ~90 ==>B
 */
public class NestedIf {
    public static void main(String[] args) {
        int score = 70;
        String result = "";
        if (score >=0 && score<=100){// valid score

            if (score >=90 ){
                result= "A";
            }else if (score >=80){
                result= "B";
            }else if (score >=70){
                result="C";
            }else if (score >= 60){
                result="D";
            }else {
                result="F";
            }


        }else {//invalid score
            result= "Invalid Score";
        }
        System.out.println(result);
    }
}
