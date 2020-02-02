
package tarifa;
import java.util.Scanner;

public class Tarifa {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int X = sc.nextInt();
       int N = sc.nextInt();
       int []Pi= new int[N];
       int used = 0;
       for(int i = 0 ; i<N ; i++){
         Pi[i]=sc.nextInt();
         used+=Pi[i];
       }
       int sum = X*N - used + X ; 
        System.out.println(sum);
    }
    
}
