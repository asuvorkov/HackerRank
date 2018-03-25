package ThirtyDaysOfCode;

import java.util.*;
import java.io.*;

/**
 * Created by Andrei on 15.07.2017.
 */
public class DictionariesAndMaps {
    public static void main(String []arg){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneBook.containsKey(s)){
                System.out.println(s + "=" + phoneBook.get(s));
            }else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
