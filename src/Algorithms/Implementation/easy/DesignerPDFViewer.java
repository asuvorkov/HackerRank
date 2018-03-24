package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 24.03.2018.
 */
public class DesignerPDFViewer {
  private static final int ASCII_POSITION = 97;
  static int designerPdfViewer(int[] h, String word) {
    // Complete this function
    int tallestChar = 0;
    char[] charArray = word.toCharArray();
    for (char currentChar : charArray){
      int currentCharHeight = h[(int) currentChar - ASCII_POSITION];
      if (tallestChar < currentCharHeight){
        tallestChar = currentCharHeight;
      }
    }
    return charArray.length * tallestChar;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] h = new int[26];
    for(int h_i = 0; h_i < 26; h_i++){
      h[h_i] = in.nextInt();
    }
    String word = in.next();
    int result = designerPdfViewer(h, word);
    System.out.println(result);
    in.close();
  }
}
