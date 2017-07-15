package ThirtyDaysOfCode;

import java.util.*;

/**
 * Created by Andrei on 15.07.2017.
 */
public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for (int a = arr.length - 1; a > -1; a--){
            System.out.print (arr[a]);
            if (a != 0){
                System.out.print (" ");
            }
        }
    }
}
