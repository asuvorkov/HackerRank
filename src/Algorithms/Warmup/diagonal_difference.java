package Algorithms.Warmup;

/**
 * Created by Andrei on 28.05.2017.
 */

import java.util.*;

public class diagonal_difference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int diag1 = 0;
        int diag2 = 0;
        int summ1 = 0;
        int summ2 = 0;
        int counter = 1;
        int output = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if (a_i == a_j) {
                    summ1 += a[a_i][a_j];
                }
                if (a_j == n - counter) {
                    summ2 += a[a_i][a_j];
                    counter++;
                }
            }
        }
        if (summ1 >= summ2){output = summ1 - summ2;}
        else {output = summ2 - summ1;}
        System.out.println(output);
    }
}