package dicecup_kattis;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class DiceCup_Kattis {
    public static void main(String[] args) throws Exception {
      //  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       // ArrayList<Integer> num = new ArrayList<>();
        Scanner s = new Scanner(System.in);
       int b= s.nextInt(); 
       int d= s.nextInt();
       
        int []arr = new int[b*d];
        for(int i = 1 ; i <=b ;i++){
            for(int j = 1 ; j<=d ; j++){
                arr[i+j]+=1;
            }
        }
        int max = 0 ;
        for(int i = 0; i<b*d ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        for(int i = 0 ; i<b*d ; i++){
            if(arr[i]==max){
                System.out.println(i);
            }
        }
       // System.out.println(Arrays.toString(arr));
        
    }
}
    

