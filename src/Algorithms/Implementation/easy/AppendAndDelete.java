package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 07.04.2018.
 */
public class AppendAndDelete {
  static String appendAndDelete(String s, String t, int k) {
    // Complete this function
    List<Character> charListS = new ArrayList<>();
    for (char c : s.toCharArray()) {
      charListS.add(c);
    }
    List<Character> charListT = new ArrayList<>();
    for (char c : t.toCharArray()) {
      charListT.add(c);
    }

    if (k >= charListS.size() + charListT.size()){
      return "Yes";
    }

    while (true){
      if (charListS.size() == 0 || charListT.size() == 0){
        break;
      }
      if (charListS.get(0) == charListT.get(0)){
        charListS.remove(0);
        charListT.remove(0);
      }else {
        break;
      }
    }

    int restK = k - (charListS.size() + charListT.size());
    if (restK > -1 && restK % 2 == 0){
      return "Yes";
    }else {
      return "No";
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String t = in.next();
    int k = in.nextInt();
    String result = appendAndDelete(s, t, k);
    System.out.println(result);
    in.close();
  }
}
