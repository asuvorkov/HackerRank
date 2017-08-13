package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 13.08.2017.
 */
public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        int numberOfPairs = 0;
        Arrays.sort( ar );
        for (int i = 1; i < ar.length; i++){
            if (ar[i] == ar[i - 1]){
                numberOfPairs++;
                i++;
            }
        }
        return numberOfPairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
