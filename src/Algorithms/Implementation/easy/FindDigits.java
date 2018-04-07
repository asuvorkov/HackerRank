package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 07.04.2018.
 */
public class FindDigits {
  static int findDigits(int n) {
    // Complete this function
    List digits = new ArrayList();

    int number = n;
    int divisor = 10;
    while (number > 0){
      if (number % divisor > 0){
        digits.add(number % divisor);
      }
      number /= divisor;
    }
    int output = 0;
    for (Object digit : digits) {
      if (n % (int)digit == 0){
        output++;
      }
    }
    return output;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
      int n = in.nextInt();
      int result = findDigits(n);
      System.out.println(result);
    }
    in.close();
  }
}
