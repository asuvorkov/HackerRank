package ThirtyDaysOfCode;

import java.io.*;
import java.util.*;

/**
 * Created by Andrei on 21.07.2017.
 */
interface AdvancedArithmetic{
    int divisorSum(int n);
}

//Write your code here
class Calculator1 implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int summ = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                summ += i;
            }
        }
        return summ;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator1();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
