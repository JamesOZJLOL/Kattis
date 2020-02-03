package detaileddifference_kattis;
import java.util.*;
import java.io.*;
public class DetailedDifference_Kattis {

    public static void main(String[] args) throws Exception {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0 ;
        do{
            String str1 = br.readLine();
            String str2 = br.readLine();
            pw.println(str1);
            pw.println(str2);
            for(int i = 0 ; i<str1.length();i++){
                if(str1.charAt(i)==str2.charAt(i))
                    pw.print(".");
                else
                    pw.print("*");
            }
            pw.println("\n");
            cnt++;
        }while(cnt<num);
        pw.close();
    }
    
}
