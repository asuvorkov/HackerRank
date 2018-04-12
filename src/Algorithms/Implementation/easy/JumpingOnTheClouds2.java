package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 12.04.2018.
 */
public class JumpingOnTheClouds2 {
  static int jumpingOnClouds(int[] c) {
    // Complete this function
    int jumps = -1;
    for (int i = 0; i < c.length; i++, jumps++) {
      if (i < c.length-2 && c[i+2] == 0) i++;
    }
    return jumps;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] c = new int[n];
    for(int c_i = 0; c_i < n; c_i++){
      c[c_i] = in.nextInt();
    }
    int result = jumpingOnClouds(c);
    System.out.println(result);
    in.close();
  }
}
