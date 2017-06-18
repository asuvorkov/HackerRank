package Algorithms.Implementation.easy;

/**
 * Created by Andrei on 15.06.2017.
 */
import java.util.*;

public class between_two_sets {
    static int getTotalX(int[] a, int[] b){
        // Complete this function
        boolean pass;
        int result = 0;
        int min = a[a.length - 1];
        int max = b[0];
        for (int i = min; i < max + 1; i++){
            pass = true;
            for (int counter = 0; counter < a.length; counter++){
                if (i % a[counter] != 0){
                    counter = a.length;
                    pass = false;
                }
            }
            if (pass){
                for (int counter1 = 0; counter1 < b.length; counter1++){
                    if (b[counter1] % i != 0){
                        counter1 = b.length;
                        pass = false;
                    }
                }
            }
            if (pass){result++;}
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
