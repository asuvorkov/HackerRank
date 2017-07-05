package ThirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by Andrei on 05.07.2017.
 */
public class conditional_statements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n % 2 == 1){
            ans = "Weird";
        }
        else{
            // Complete the code
            if (n > 1 && n < 6){
                ans = "Not Weird";
            }
            if (n > 5 && n < 21){
                ans = "Weird";
            }
            if (n > 20){
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }
}
