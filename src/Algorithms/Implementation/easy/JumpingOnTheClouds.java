package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 30.03.2018.
 */
public class JumpingOnTheClouds {
  static int jumpingOnClouds(int[] c, int k) {
    // Complete this function
    int energy = 100;
    int i = 0;
    do {
      energy--;
      i = (i + k) % c.length;
      if (c[i] == 1){
        energy -= 2;
      }
    }while (i != 0);
    return energy;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] c = new int[n];
    for(int c_i = 0; c_i < n; c_i++){
      c[c_i] = in.nextInt();
    }
    int result = jumpingOnClouds(c, k);
    System.out.println(result);
    in.close();
  }
}
