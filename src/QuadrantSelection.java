package quadrantselection;
import java.util.*;
public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        while(x==0)
            x=sc.nextInt();
        int y = sc.nextInt();
        while(y==0)
            y=sc.nextInt();
        if(x>0 && y>0)
            System.out.println(1);
        else if (x<0 && y>0)
            System.out.println(2);
        else if (x<0 && y<0)
            System.out.println(3);
        else if(x>0 && y<0 )
            System.out.println(4);
    }
    
}
