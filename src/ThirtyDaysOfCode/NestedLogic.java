package ThirtyDaysOfCode;

import java.util.*;

/**
 * Created by Andrei on 31.07.2017.
 */
public class NestedLogic {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int dayActual = in.nextInt();
        int monthActual = in.nextInt();
        int yearActual = in.nextInt();
        int dayExpected = in.nextInt();
        int monthExpected = in.nextInt();
        int yearExpected = in.nextInt();
        int fine = 0;
        if (yearActual > yearExpected){
            fine = 10000;
        }else {
            if (monthActual > monthExpected && yearActual == yearExpected){
                fine = 500 * (monthActual - monthExpected);
            }else {
                if (dayActual > dayExpected && monthActual == monthExpected && yearActual == yearExpected){
                    fine = 15 * (dayActual - dayExpected);
                }
            }
        }
        System.out.println(fine);
    }
}
