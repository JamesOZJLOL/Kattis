package dragonofloowater;
import java.util.Arrays;
import java.util.Scanner;
public class DragonOfLoowater {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int numDragon = s.nextInt();
        int numKnight = s.nextInt();
        
        
        while(numDragon!=0 && numKnight!=0){
            int [] heightDragon=new int[numDragon];
            int [] heightKnight=new int[numKnight];
            for(int i = 0 ;i<heightDragon.length;i++)
                heightDragon[i]=s.nextInt();
            for(int i = 0 ;i<heightKnight.length;i++)
                heightKnight[i]=s.nextInt();
            
            Arrays.sort(heightKnight);
            Arrays.sort(heightDragon);
            
            int gold=0;
            int cnt = 0;
            for(int i = 0,j=0 ;i<heightDragon.length && j<heightKnight.length;j++){
                //System.out.println(j);
                if(heightKnight[j]>=heightDragon[i]){
                    gold+=heightKnight[j];
                    cnt++;
                    i++;
                }
               // System.out.println(gold);
            }
            if(cnt==numDragon){
                System.out.println(gold);
            }
            else{
                System.out.println("Loowater is doomed!");
            }
            numDragon = s.nextInt();
            numKnight = s.nextInt();
        }
    }
    
}
