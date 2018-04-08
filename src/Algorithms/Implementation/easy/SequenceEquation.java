package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 08.04.2018.
 */
public class SequenceEquation {
  static int[] permutationEquation(int[] p) {
    // Complete this function
    int[] output = new int[p.length];
    for (int i = 0; i < p.length; i++){
      for (int j = 0; j < p.length; j++){
        if (i + 1 == p[j]){
          for (int k = 0; k < p.length; k++){
            if (j + 1 == p[k]){
              output[i] = k + 1;
              break;
            }
          }
          break;
        }
      }
    }
    return output;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] p = new int[n];
    for(int p_i = 0; p_i < n; p_i++){
      p[p_i] = in.nextInt();
    }
    int[] result = permutationEquation(p);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
    }
    System.out.println("");
    in.close();
  }
}
