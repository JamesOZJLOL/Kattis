/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_p1_3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ASUS
 */
public class T1_P1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
        final int MAX=11;
       Random rd = new Random();
       
       int num1=rd.nextInt(MAX);
        System.out.println(num1);
       if(num1%2==0 || num1>6 ) {
           System.out.println("WIN");
       }
       else {
           System.out.println("LOSE");
       }
       }
}
