package ThirtyDaysOfCode;

import java.util.*;

/**
 * Created by Andrei on 30.07.2017.
 */
public class RunningTimeAndComplexity {
    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int counter = 0; counter < n; counter++) {
            int val = in.nextInt();

            for(int i=2; i <= val / i; i++){
                if(val % i == 0) val = 1;
            }

            if(val == 1) System.out.println("Not prime");
            else System.out.println("Prime");
        }
    }
}
