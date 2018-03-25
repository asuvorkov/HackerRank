package ThirtyDaysOfCode;

import java.util.*;

/**
 * Created by Andrei on 16.07.2017.
 */
class Difference {
    private int[] elements;
    public int maximumDifference;
    // Add your code here
    Difference(int[] elements){
        this.maximumDifference = maximumDifference;
        this.elements = elements;
    }

    public void computeDifference() {
        int tempMin = elements[0];
        int tempMax = elements[0];
        for (int i = 1; i < elements.length; i++){
            if (tempMin > elements[i]){
                tempMin = elements[i];
            }
            if (tempMax < elements[i]){
                tempMax = elements[i];
            }
        }
        maximumDifference = tempMax - tempMin;
    }
}

public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
