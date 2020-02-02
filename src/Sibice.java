
package sibice;
import java.util.*;
public class Sibice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  =  sc.nextInt();
        int W =sc.nextInt();
        int H = sc.nextInt();
        int []dimensions = new int[N];
        for(int i = 0 ; i<N ;i++)
            dimensions[i]=sc.nextInt();
        for(int i = 0 ; i<N ;i++){
            if(dimensions[i]<=Math.sqrt(W*W+H*H))
                System.out.println("DA");
            else
                System.out.println("NE");
        }
    }
    
}
