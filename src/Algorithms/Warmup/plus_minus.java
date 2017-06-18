package Algorithms.Warmup;

/**
 * Created by Andrei on 28.05.2017.
 */

import java.util.*;

public class plus_minus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double pos = 0;
        double neg = 0;
        double zero = 0;
        double div = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] > 0){pos++;}
            if (arr[arr_i] < 0){neg++;}
            if (arr[arr_i] == 0){zero++;}
        }
        div = pos / n;
        System.out.println(div);
        div = neg / n;
        System.out.println(div);
        div = zero / n;
        System.out.println(div);
    }
}
