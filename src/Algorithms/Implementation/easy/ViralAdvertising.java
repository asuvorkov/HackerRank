package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 29.03.2018.
 */
public class ViralAdvertising {
  static int viralAdvertising(int n) {
    // Complete this function
    int peopleReceived = 5;
    int peopleLiked = 0;

    for (int i = 1; i < n + 1; i++){
      int peopleShared = (int) Math.floor(peopleReceived / 2);
      peopleLiked += peopleShared;
      peopleReceived = peopleShared  * 3;
    }
    return peopleLiked;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = viralAdvertising(n);
    System.out.println(result);
    in.close();
  }
}
