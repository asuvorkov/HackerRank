package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 19.08.2017.
 */
public class PickingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int output = 0;
        for (int i = a.length - 1; i > 0; i--) {
            int temp = 1;
            int current = i - 1;
            while (current > -1 && a[i] - a[current] <= 1) {
                temp++;
                current--;
            }
            if (output < temp) {
                output = temp;
            }
        }
        System.out.print(output);
    }
}
