package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 11.04.2018.
 */
public class CutTheSticks {
  static int[] cutTheSticks(int[] arr) {
    // Complete this function
    List cutSticks = new ArrayList();

    while (!arrEmpty(arr)){
      int min = Integer.MAX_VALUE;
      for (int a : arr) {
        if (a != 0 && a < min) {
          min = a;
        }
      }

      int sticks = 0;
      for (int i = 0; i < arr.length; i++){
        if (arr[i] != 0){
          arr[i] -= min;
          sticks++;
        }
      }

      cutSticks.add(sticks);
    }

    int[] output = new int[cutSticks.size()];
    for (int i = 0; i < output.length; i++){
      output[i] = (int)cutSticks.get(i);
    }
    return output;
  }

  private static boolean arrEmpty(int[] arr) {
    for (int a : arr) {
      if (a != 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int arr_i = 0; arr_i < n; arr_i++){
      arr[arr_i] = in.nextInt();
    }
    int[] result = cutTheSticks(arr);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
    }
    System.out.println("");


    in.close();
  }
}
