package Algorithms.Warmup;

/**
 * Created by Andrei on 28.05.2017.
 */
import java.util.*;

public class mini_max_summ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long[] sum = new long[5];
        long calc = 0;
        int a = 0;
        int i = 0;
        int counter = 0;
        long min = 0;
        long max = 0;
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        while (i < 5){
            while (counter < 5){
                if (counter != a){
                    calc += arr[counter];
                }
                counter++;
            }
            counter = 0;
            sum[i] = calc;
            calc = 0;
            a++;
            i++;
        }
        i = 0;
        min = sum[0];
        max = sum[0];
        while (i < 5){
            if (max < sum[i]){
                max = sum[i];
            }
            if (min > sum[i]){
                min = sum[i];
            }
            i++;
        }

        System.out.println("" + min+ " " + max);
    }
}
