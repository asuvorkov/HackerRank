package Algorithms.Implementation.easy;

/**
 * Created by Andrei on 01.06.2017.
 */
import java.util.*;

public class grading_students {
    static int[] solve(int[] grades){
        // Complete this function
        int mod;
        int temp;
        for (int i = 0; i < grades.length; i++){
            if (grades[i] > 37){
                mod = grades[i] % 5;
                temp = grades[i] + 5 - mod;
                if (temp - grades[i] < 3){
                    grades[i] = temp;
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
