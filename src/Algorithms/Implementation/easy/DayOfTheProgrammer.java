package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 13.08.2017.
 */
public class DayOfTheProgrammer {
    static String solve(int year){
        // Complete this function
        String output = "";
        if (year == 1918){
            output = "26.09.1918";
        }
        if (year < 1918) {
            if (year % 4 == 0){
                output = "12.09." + year;
            }else {
                output = "13.09." + year;
            }
        }
        if (year > 1918) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
                output = "12.09." + year;
            }else {
                output = "13.09." + year;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
