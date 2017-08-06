package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 06.08.2017.
 */
public class MigratoryBirds {
    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int firstGroup = 0;
        int secondGroup = 0;
        int thirdGroup = 0;
        int fourthGroup = 0;
        int fifthGroup = 0;
        for (int i = 0; i < ar.length; i++){
            switch ( ar[i] ) {
                case 1: firstGroup++; break;
                case 2: secondGroup++; break;
                case 3: thirdGroup++; break;
                case 4: fourthGroup++; break;
                case 5: fifthGroup++; break;
            }
        }
        int[] data = {firstGroup,secondGroup,thirdGroup,fourthGroup,fifthGroup};
        int temp = 0;
        for (int a = 0; a < data.length; a++){
            if (data[temp] < data[a]){
                temp = a;
            }
        }
        temp++;
        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
