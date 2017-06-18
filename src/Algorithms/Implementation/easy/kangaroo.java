package Algorithms.Implementation.easy;

/**
 * Created by Andrei on 15.06.2017.
 */
import java.util.*;

public class kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        String result = new String();
        if (x2 > x1 && v2 > v1){
            result = "NO";
        } else{
            for (int i = 0; i < 10000; i++){
                if (x1 + i*v1 == x2 + i*v2){
                    result = "YES";
                    i = 10000;
                }
            }
            if (result != "YES"){
                result = "NO";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
