package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 14.04.2018.
 */
public class EqualizeTheArray {
  static int equalizeArray(int[] arr) {
    // Complete this function
    int max = 1;
    Map<Integer, Integer> nums = new HashMap<>();
    for (int i : arr)
      if (!nums.containsKey(i))
        nums.put(i, 1);
      else {
        nums.put(i, nums.get(i) + 1);
        if (max < nums.get(i))
          max = nums.get(i);
      }
    return arr.length - max;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int arr_i = 0; arr_i < n; arr_i++){
      arr[arr_i] = in.nextInt();
    }
    int result = equalizeArray(arr);
    System.out.println(result);
    in.close();
  }
}
