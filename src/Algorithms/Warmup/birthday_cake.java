package Algorithms.Warmup;

/**
 * Created by Andrei on 30.05.2017.
 */
import java.util.*;

public class birthday_cake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int counter = 0;
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if (max < height[height_i]){max = height[height_i];}
        }
        for(int i=0; i < n; i++){
            if (max == height[i]){counter++;}
        }
        System.out.println(counter);
    }
}
