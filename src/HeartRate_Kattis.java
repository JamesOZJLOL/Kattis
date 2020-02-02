package heartrate_kattis;

import java.util.Scanner;

public class HeartRate_Kattis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        double []bpm = new double[cases];
        double []minabpm = new double[cases];
        double []maxabpm = new double[cases];
        for (int i = 0 ; i<cases ; i++){
            int b = s.nextInt();
            double p = s.nextDouble();
            bpm[i]=60*b/p;
            minabpm[i]=60/(p/(b-1));
            maxabpm[i]=120*b/p-minabpm[i];
        }
        for(int i = 0 ; i<cases ; i++){
            System.out.printf("%.4f %.4f %.4f",minabpm[i],bpm[i],maxabpm[i]);
        System.out.println("");
        }
    }
    
}