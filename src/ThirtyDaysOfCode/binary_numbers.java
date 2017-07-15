package ThirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Andrei on 15.07.2017.
 */
public class binary_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int output = 0;
        int counter = 0;
        while (n > 0){
            int temp = n % 2;
            if (temp == 1){
                counter++;
                n--;
                if (output < counter){
                    output = counter;
                }
            }else {
                if (output < counter){
                    output = counter;
                }
                counter = 0;
            }
            n /= 2;
        }
        System.out.println(output);
    }
}
