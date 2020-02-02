package grassseedinc_kattis;
import java.util.*;
public class GrassSeedInc_Kattis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double cost =s.nextDouble();
        int pass = s.nextInt();
        double area = 0;
        for(int i = 0 ; i<pass  ; i++){
            area += s.nextDouble()*s.nextDouble();
        }
        System.out.printf("%.7f",area*cost);
    }
    
}
