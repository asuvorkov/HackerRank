package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 24.03.2018.
 */
public class UtopianTree {
  static int utopianTree(int n) {
    // Complete this function
    if (n == 0){
      return 1;
    }

    int treeHeight = 1;
    for (int i = 1; i < n + 1; i++){
      if (i % 2 == 1){
        treeHeight *= 2;
      }else {
        treeHeight++;
      }
    }
    return treeHeight;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
      int n = in.nextInt();
      int result = utopianTree(n);
      System.out.println(result);
    }
    in.close();
  }
}
