package ThirtyDaysOfCode;

import java.util.*;

/**
 * Created by Andrei on 31.07.2017.
 */
public class BitwiseAND {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a = 0; a < t; a++){
            int n = in.nextInt();
            int k = in.nextInt();
            if(((k - 1) | k) > n && k % 2 == 0){
                System.out.println(k - 2);
            }else{
                System.out.println(k - 1);
            }
        }
    }
}
