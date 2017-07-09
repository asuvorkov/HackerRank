package ThirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Andrei on 09.07.2017.
 */
public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mul;
        for (int i = 1; i < 11; i++){
            mul = i * n;
            System.out.println (n + " x " + i + " = " + mul);
        }
    }
}
