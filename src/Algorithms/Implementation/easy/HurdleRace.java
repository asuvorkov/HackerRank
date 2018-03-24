package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 24.03.2018.
 */
public class HurdleRace {
  static int hurdleRace(int k, int[] height) {
    // Complete this function
    int max = 0;
    for (int currentHeight : height) {
      if (currentHeight > max) {
        max = currentHeight;
      }
    }
    if (k >= max){
      return 0;
    }else {
      return max - k;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] height = new int[n];
    for(int height_i = 0; height_i < n; height_i++){
      height[height_i] = in.nextInt();
    }
    int result = hurdleRace(k, height);
    System.out.println(result);
    in.close();
  }
}
