package ThirtyDaysOfCode;

import java.util.*;

/**
 * Created by Andrei on 15.07.2017.
 */
public class Recursion {
    static int factorial(int n) {
        // Complete this function
        int fact;
        if (n == 1){
            return 1;
        }else {
            fact = factorial(n - 1) * n;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
