package qualityadjustedlifeyear;
import java.util.*;
public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        double sum = 0;
        for (int i = 0 ; i<N ; i ++){
         sum=sc.nextDouble()*sc.nextDouble()+sum;
        }
        System.out.println(sum);
    }
    
}
