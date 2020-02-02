package chartingprogress_kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ChartingProgress_Kattis  {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        //bufferedreader only read  text data or string
        // Can use scanner but scanner takes long time as it read and parse  text data into data types
        String[] store = new String[100];
        int index = 0 ;
        String str ;
        boolean noLine = false;
        while((str=br.readLine())!=null){
           
            
            
            int cntStar = countAsterisk(str);
            //index+=cntStar;
            if(str.equals("")){
                index=0;
               out.println();
                //System.out.println("");
                continue;
            }
            if(!str.contains("*")){
                out.println(str);
                //System.out.println(str);
                continue;
            }
            for(int i = 0 ; i<str.length()-index-cntStar;i++){
                out.print(".");
                //System.out.print(".");
            }
            for(int j = str.length()-index-cntStar ; j<str.length()-index;j++){
                out.print("*");
                //System.out.print("*");
            }
            for(int k = str.length()-index; k<str.length();k++){
                out.print(".");
                //System.out.print(".");
            }
            out.println();
            index+=cntStar;
            
        }
        
        
    }    
    
    
    
    public static int countAsterisk(String str){
        int cnt=0;
        for(int i = 0 ; i < str.length() ; i++){
            
            if(str.charAt(i)=='*')
                cnt++;
        }
        return cnt;
    }
    
}
