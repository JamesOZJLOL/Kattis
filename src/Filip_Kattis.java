package filip_kattis;
import java.util.Scanner;
public class Filip_Kattis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        String str1 = ""+num1 ,str2= ""+num2;
        num1 = Integer.parseInt(reverseString(str1));
        num2 = Integer.parseInt(reverseString(str2));
        System.out.println((num1>num2)? num1:num2);
    }
    
    public static String reverseString(String str){
        String rev = "";
        for(int i = str.length()-1 ; i>=0 ; i --)
            rev+=str.charAt(i);
        return rev;
    }
}
