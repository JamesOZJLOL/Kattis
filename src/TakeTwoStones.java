
package taketwostones;
import java.util.Scanner;
public class TakeTwoStones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        if (N%2==0)
            System.out.println("Bob");
        else
            System.out.println("Alice");
    }
    
}
