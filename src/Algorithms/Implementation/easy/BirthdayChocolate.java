package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 06.08.2017.
 */
public class BirthdayChocolate {
    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        int numberOfPossibleSolutions = 0;
        int counter = 0;
        int summ = 0;
        while (counter <= s.length - m){
            for (int a = 0; a < m; a++){
                summ += s[counter + a];
            }
            if (summ == d){
                numberOfPossibleSolutions++;
            }
            summ = 0;
            counter++;
        }
        return numberOfPossibleSolutions;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
