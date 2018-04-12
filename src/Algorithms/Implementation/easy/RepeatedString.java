package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 12.04.2018.
 */
public class RepeatedString {
  static long repeatedString(String s, long n) {
    // Complete this function
    long as = 0;
    for (char c : s.toCharArray()) {
      if (c == 'a') {
        as++;
      }
    }

    as *= n / s.length();
    long rest = n % s.length();
    for (int i = 0; i < rest; i++){
      if (s.charAt(i) == 'a') {
        as++;
      }
    }
    return as;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    long n = in.nextLong();
    long result = repeatedString(s, n);
    System.out.println(result);
    in.close();
  }
}
