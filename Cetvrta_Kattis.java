package cetvrta_kattis;
import java.util.Arrays;
import java.util.Scanner;
public class Cetvrta_Kattis {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int x1,x2,x3,x4=0,y1,y2,y3,y4=0;
        x1 =s.nextInt();
        y1=s.nextInt();
        
        x2 =s.nextInt();
        y2=s.nextInt();
        
        x3 =s.nextInt();
        y3=s.nextInt();
        
        if(x1==x2)
            x4=x3;
        else if(x1==x3)
            x4=x2;
        else if(x2==x3)
            x4=x1;
        
        if(y1==y2)
            y4=y3;
        else if(y1==y3)
            y4=y2;
        else if(y2==y3)
            y4=y1;
        
        System.out.println(x4+" "+y4);
        
    }
}
    

