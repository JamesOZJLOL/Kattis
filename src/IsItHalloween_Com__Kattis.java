package isithalloween_com__kattis;
import java.util.Scanner;
public class IsItHalloween_Com__Kattis {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String str = s.nextLine();
        if(str.equals("OCT 31") || str.equals("DEC 25"))
            System.out.println("yup");
        else
            System.out.println("nope");
    }
    
}
