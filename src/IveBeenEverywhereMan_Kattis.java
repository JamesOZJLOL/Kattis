package ivebeeneverywhereman_kattis;
import java.util.*;
import java.io.*;
public class IveBeenEverywhereMan_Kattis {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCase = Integer.parseInt(br.readLine());
        for(int i = 0 ; i<numberOfCase ; i++){
        int numberOfPlaces = Integer.parseInt(br.readLine());
        for(int j=0 ; j<numberOfPlaces ; j++){
            String str = br.readLine();
            if(!list.contains(str))
                list.add(str);
        }
            System.out.println(list.size());
            list.clear();
        }
    }
    
}
