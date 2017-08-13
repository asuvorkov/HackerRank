package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 13.08.2017.
 */
public class BonAppétit {
    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        int realBill = 0;
        for (int i = 0; i < ar.length; i++){
            if (i != k){
                realBill += ar[i];
            }
        }
        return realBill / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if (b == result){
            System.out.println("Bon Appetit");
        }else {
            System.out.println(b - result);
        }
    }
}
