
package bela_kattis;
import java.util.*;
import java.io.*;

public class Bela_Kattis {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        Scanner s = new Scanner(System.in);
        String[] temp =(s.nextLine()).split(" ");
        int num = Integer.parseInt(temp[0]);
        char dominant =temp[1].charAt(0);
        int score = 0 ;
        for(int i= 0 ; i<4*num ; i++){
            String str = s.nextLine();
            if(checkDominant(str,dominant)){
                score+=addDominantScore(str);
            }
            else
                score+=addNonDominantScore(str);
        }
        System.out.println(score);
    }
    
    public static boolean checkDominant(String str, char dominant){
        return str.charAt(1)==dominant;
    }
    
    public static int addDominantScore(String str){
        switch(str.charAt(0)){
            case 'A':
                return 11;
            case 'K':
                return 4;
            case 'Q':
                return 3;
            case 'J':
                return 20;
            case 'T':
                return 10;
            case '9':
                return 14;
            default:
                return 0 ;
        }
    }
    public static int addNonDominantScore(String str){
        switch(str.charAt(0)){
            case 'A':
                return 11;
            case 'K':
                return 4;
            case 'Q':
                return 3;
            case 'J':
                return 2;
            case 'T':
                return 10;
            default:
                return 0 ;
        }
    }
}
