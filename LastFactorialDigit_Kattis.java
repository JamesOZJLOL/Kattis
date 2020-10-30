package lastfactorialdigit_kattis;
import java.util.Scanner;
public class LastFactorialDigit_Kattis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        for(int i = 0 ; i<cases ; i++){
            System.out.println(getLastDigit(s.nextInt()));
        }
    }
    
    public static int getLastDigit(int num){
        int total = 1 ;
        for(int i = 2;i <= num ;i++ )
            total*=i;
        return total%10;
    }
}
