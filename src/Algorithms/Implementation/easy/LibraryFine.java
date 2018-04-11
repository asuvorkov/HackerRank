package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 11.04.2018.
 */
public class LibraryFine {
  static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    // Complete this function
    if (y1 > y2){
      return (y1 - y2) * 10000;
    }else {
      if (m1 > m2 && y1 == y2){
        return (m1 - m2) * 500;
      }else {
        if (d1 > d2 && m1 == m2 && y1 == y2){
          return (d1 - d2) * 15;
        }
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int d1 = in.nextInt();
    int m1 = in.nextInt();
    int y1 = in.nextInt();
    int d2 = in.nextInt();
    int m2 = in.nextInt();
    int y2 = in.nextInt();
    int result = libraryFine(d1, m1, y1, d2, m2, y2);
    System.out.println(result);
    in.close();
  }
}
