package Algorithms.Implementation.easy;

/**
 * Created by Andrei on 15.06.2017.
 */
import java.util.*;

public class breaking_the_records {
    static int[] getRecord(int[] s){
        // Complete this function
        int min; int max; int result1 = 0; int result2 = 0;
        int []output = new int[2];
        min = s[0];
        max = s[0];
        for (int i = 1; i < s.length; i++){
            if (s[i] < min){
                min = s[i];
                result2++;
            }
            if (s[i] > max){
                max = s[i];
                result1++;
            }
        }
        output[0] = result1;
        output[1] = result2;
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
