package threestrings_cf;
import java.util.*;
import java.io.*;
public class ThreeStrings_CF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = 1 , num= s.nextInt();
        s.nextLine();
        while(cnt<=num){
                String []str1 = s.nextLine().split("");
                String []str2 = s.nextLine().split("");
                String []str3 = s.nextLine().split("");
                int change = 0;
                boolean isDisplay = false;
                for(int i = 0 ; i<str1.length ; i ++){
                    //System.out.println(Arrays.toString(str1));
                    //System.out.println(Arrays.toString(str2));
                    if(!checkSame(str1[i],str2[i]) && !checkSame(str2[i],str3[i]) && !checkSame(str1[i],str3[i])){
                        toDisplay(false);
                        isDisplay=true;
                        break;
                    }
                    else if (checkSame(str1[i],str2[i]) && checkSame(str2[i],str3[i])){
                        change++;
                        //System.out.println(change);
                        //System.out.println("");
                       
                    }
                    else if(!checkSame(str1[i],str2[i]) && !checkSame(str2[i],str3[i]) && checkSame(str1[i],str3[i])){
                        String temp = str2[i];
                        str2[i]=str3[i];
                        str3[i]=temp;
                        change++;
                       // System.out.println(change);
                    }
                    else if(!checkSame(str1[i],str2[i]) && checkSame(str2[i],str3[i]) && !checkSame(str1[i],str3[i])){
                        String temp = str1[i];
                        str1[i]=str3[i];
                        str3[i]=temp;
                        change++;
                       // System.out.println(change);

                    }
                    else{
                        toDisplay(false);
                        isDisplay=true;
                       // System.out.println(change);
                        break;
                    }
                    
                }
                //System.out.println("final");
               // System.out.println(change);
                if(change==str1.length)
                    toDisplay(true);
                else if(change!=str1.length && !isDisplay)
                    toDisplay(false);
                cnt++;
        }
    }
    
    public static boolean checkSame(String str1 , String str2){
        return str1.equals(str2);
    }
    
    public static void toDisplay(boolean bool){
        System.out.printf("%s",bool?"YES":"NO");
        System.out.println("");
    } 
    
}
