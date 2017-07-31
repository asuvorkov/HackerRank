package ThirtyDaysOfCode;

import java.util.*;

/**
 * Created by Andrei on 31.07.2017.
 */
public class RegExPatternsAndIntroToDatabases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> list = new ArrayList();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            for (String isGmail : emailID.split("@")) {
                if (isGmail.equals("gmail.com")){
                    list.add(firstName);
                }
            }
        }

        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        int counter = 0;
        while (counter < list.size()){
            System.out.println(list.get(counter));
            counter++;
        }
    }
}
