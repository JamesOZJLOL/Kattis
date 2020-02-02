package datum_kattis;
import java.util.*;
public class Datum_Kattis {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] day ={31,28,31,30,31,30,31,31,30,31,30,31};
        int [] month = {1,2,3,4,5,6,7,8,9,10,11,12};
        int D =s.nextInt() , M = s.nextInt();
        int cnt = 0;  // start with Thurs 
        // 1,2,3,...7 equivalent to Thurs,Fri,Sat,Sun,..Wed
       for(int i= 0; i <= M-1 ; i++){
           if(i==M-1)
               cnt+=D;
            else
              cnt+=day[i];
           
       } 
       
       switch(cnt%7){
           case 1:
               System.out.println("Thursday");
               break;
           case 2:
               System.out.println("Friday");
               break;
           case 3:
               System.out.println("Saturday");
               break;
           case 4:
               System.out.println("Sunday");
               break;
           case 5:
               System.out.println("Monday");
               break;
           case 6:
               System.out.println("Tuesday");
               break;
           default:
               System.out.println("Wednesday");
       }
    }
    
    
    
}
