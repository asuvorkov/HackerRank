package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 28.03.2018.
 */
public class BeautifulDays {
  static int beautifulDays(int i, int j, int k) {
    // Complete this function
    int output = 0;
    for (;i <= j; i++){
      int diff = i - reverse(i);
      if (diff < 0){
        diff = (-diff);
      }
      if (diff % k == 0){
        output++;
      }
    }
    return output;
  }

  private static int reverse(int i) {
    long reversedNum = 0;
    long input_long = i;

    while (input_long != 0) {
      reversedNum = reversedNum * 10 + input_long % 10;
      input_long = input_long / 10;
    }

    if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
      throw new IllegalArgumentException();
    }
    return (int) reversedNum;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    int j = in.nextInt();
    int k = in.nextInt();
    int result = beautifulDays(i, j, k);
    System.out.println(result);
    in.close();
  }
}
