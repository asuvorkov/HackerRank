package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 13.08.2017.
 */
public class DrawingBook {
    static int solve(int n, int p){
        // Complete this function
        int minAmountOfTurns = 0;
        if (n % 2 == 1){
            n--;
        }
        if (p % 2 == 1){
            p--;
        }
        int fromFirstPage = p / 2;
        int fromLastPage = (n - p) / 2;
        if (fromFirstPage <= fromLastPage){
            minAmountOfTurns = fromFirstPage;
        }else {
            minAmountOfTurns = fromLastPage;
        }
        return minAmountOfTurns;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
