/*Input contains a single test case. 
Each test case contains three integers on a single line, X, Y and N (1≤X<Y≤N≤100).

Output
Print integers from 1 to N in order, each on its own line, 
replacing the ones divisible by X with Fizz, 
the ones divisible by Y with Buzz and ones divisible by both X and Y with FizzBuzz.
 */
package fizzbuzz;
import java.io.*;
import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int X = Integer.parseInt(st.nextToken());
       int Y = Integer.parseInt(st.nextToken());
       int N = Integer.parseInt(st.nextToken());
       
       for (int i = 1 ; i <=N ; i++){
           if(i%X == 0 && i%Y == 0)
               System.out.println("FizzBuzz");
           else if (i%X == 0)
               System.out.println("Fizz");
           else if (i%Y == 0)
               System.out.println("Buzz");
           else
               System.out.println(i);
       
       }
    }
    
}
