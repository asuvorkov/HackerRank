package ThirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Andrei on 09.07.2017.
 */
public class LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n + 1; i++){
            String output1 = "";
            String output2 = "";
            String myString = in.next();
            char[] myCharArray = myString.toCharArray();
            for (int a = 0; a < myCharArray.length; a++){
                if (a % 2 == 0){
                    output2 += myCharArray[a];
                } else {
                    output1 += myCharArray[a];
                }
            }
            System.out.println (output2 + " " + output1);
        }
    }
}
