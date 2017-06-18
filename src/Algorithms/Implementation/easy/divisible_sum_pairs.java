package Algorithms.Implementation.easy;

/**
 * Created by Andrei on 15.06.2017.
 */
import java.util.*;

public class divisible_sum_pairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
        int output = 0;
        for (int i = 0; i < ar.length; i++){
            for (int a = i + 1; a < ar.length; a++){
                if ((ar[i] + ar[a]) % k == 0){
                    output++;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
