package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 06.08.2017.
 */
public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int numberOfApples = 0;
        int numberOfOranges = 0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if (apple[apple_i] + a >= s && apple[apple_i] + a <= t){
                numberOfApples++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if (orange[orange_i] + b <= t && orange[orange_i] + b >= s){
                numberOfOranges++;
            }
        }
        System.out.println(numberOfApples);
        System.out.println(numberOfOranges);
    }
}
