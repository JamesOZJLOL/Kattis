package bingiton_kattis;
import java.util.*;
import java.io.*;
public class BingItOn_Kattis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
        int num = Integer.parseInt(br.readLine());
        String [] word = new String[num];
        int cnt = 1;
        word[0]=br.readLine();
        pw.println(0);
        do{
            word[cnt]=br.readLine();
            int repeat = getSame(word,word[cnt],cnt);
            pw.println(repeat);
            cnt++;
        }while(cnt<num);
        pw.close();
    }
    
    public static int getSame(String[] array ,String str, int counter){
        int cnt = 0 ;
        for(int i = 0 ; i <counter ; i++){
            if(array[i].charAt(0)==str.charAt(0) && str.length()<=array[i].length()){
                boolean isContain = true;
                for(int j = 1 ; j<str.length()  ; j++){
                    if(str.charAt(j)!=array[i].charAt(j)){
                        isContain = false;
                        break;
                    }
                }
                if(isContain)
                    cnt++;
            }
                    
        }
        return cnt;
    }
}
