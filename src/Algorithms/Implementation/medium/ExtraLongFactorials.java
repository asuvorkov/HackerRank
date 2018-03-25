package Algorithms.Implementation.medium;

/**
 * Created by Andrei on 18.06.2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    // Returns Factorial of N
    static BigInteger factorial(int N)
    {
        // Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }

    // Driver method
    public static void main(String args[]) throws Exception
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int N = n;
        System.out.println(factorial(N));
    }
}
