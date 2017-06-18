package Algorithms.Warmup;

/**
 * Created by Andrei on 31.05.2017.
 */
import java.util.*;

public class time_conversion {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int hours = 0;
        int min = 0;
        int sec = 0;
        String newTime = "";

        String time12 = x.nextLine();

        StringTokenizer st = new StringTokenizer(time12.substring(0,time12.length()-2), ":");
        while(st.hasMoreTokens()){
            hours = Integer.parseInt(st.nextToken());
            min = Integer.parseInt(st.nextToken());
            sec = Integer.parseInt(st.nextToken());
        }

        if(time12.substring(time12.length()-2,time12.length()).equals("PM")){
            if(hours !=12)	hours += 12;
        }else{
            if(hours == 12) hours-=12;
        }
        newTime = String.format("%1$02d:%2$02d:%3$02d",hours,min,sec);
        System.out.println(newTime);
    }
}
