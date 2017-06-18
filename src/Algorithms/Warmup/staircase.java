package Algorithms.Warmup;

/**
 * Created by Andrei on 28.05.2017.
 */
import java.util.*;

public class staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String empty = " ";
        String hash = "#";
        String output = "";
        int m = n;
        int line = 1;
        while (line != n + 1){
            m = n - line;
            while (m != 0){
                output += empty;
                m--;
            }
            while (line - m != 0){
                output += hash;
                m++;
            }
            line++;
            System.out.println(output);
            output = "";
        }
    }
}
