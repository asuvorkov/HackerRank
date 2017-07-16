package ThirtyDaysOfCode;

import java.util.*;

/**
 * Created by Andrei on 16.07.2017.
 */
public class exceptions_string_to_integer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int output;
        try {
            output = Integer.parseInt(S);
            System.out.println(output);
        } catch (Exception e){
            System.out.println("Bad String");
        }
    }
}
