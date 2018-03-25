package ThirtyDaysOfCode;

import java.util.*;
import java.math.*;
/**
 * Created by Andrei on 05.07.2017.
 */
public class Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double calc = mealCost + (mealCost * tipPercent / 100) + (mealCost * taxPercent / 100);

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(calc);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
