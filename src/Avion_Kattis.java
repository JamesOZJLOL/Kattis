package avion_kattis;

import java.util.Scanner;

public class Avion_Kattis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean fleeAway = true;
        for(int i = 0 ; i<5; i++){
            String[] str = s.nextLine().split("-");
            for(int j = 0 ; j <str.length ; j++){
                if(str[j].contains("FBI")){
                    System.out.println(i+1);
                    fleeAway = false;
                    break;
                }
            }
        }
        if(fleeAway)
                System.out.println("HE GOT AWAY!");
    }
    
}
