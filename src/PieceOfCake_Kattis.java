package pieceofcake._kattis;
import java.util.Scanner;
public class PieceOfCake_Kattis {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int size = s.nextInt() , cut1 = s.nextInt(), cut2 = s.nextInt();
        int mid = size/2;
        if(cut1>mid)
            if(cut2>mid)
                System.out.println(cut1*cut2*4);
            else
                System.out.println(cut1*(size-cut2)*4);
        else
            if(cut2>mid)
                System.out.println((size-cut1)*cut2*4);
            else
                System.out.println((size-cut1)*(size-cut2)*4);
    }
    
}
