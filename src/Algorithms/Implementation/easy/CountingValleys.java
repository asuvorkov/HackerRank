package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 15.08.2017.
 */
public class CountingValleys {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); input.nextLine();
        String terrain = input.nextLine();
        int level = 0; //Start at sea level
        int valleys = 0;
        boolean belowSea = false;

        for(int i = 0; i < n; i++)
        {
            if(terrain.charAt(i) == 'U')//Uphill
                level++;
            else//Downhill
                level--;

            //Handle transitions
            if(!belowSea && level < 0)
            {
                valleys++;
                belowSea = true;
            }

            if(level >= 0)//We are back above sea level
                belowSea = false;
        }
        System.out.println(valleys);
    }
}
