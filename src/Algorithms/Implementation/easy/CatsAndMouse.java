package Algorithms.Implementation.easy;

/**
 * Created by Andrei on 17.06.2017.
 */
import java.util.*;

public class CatsAndMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String catA = "Cat A";
        String catB = "Cat B";
        String mouse = "Mouse C";
        String result = new String();
        int temp1;
        int temp2;
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            temp1 = x - z;
            temp2 = y - z;
            if (temp1 < 0){
                temp1 *= -1;
            }
            if (temp2 < 0){
                temp2 *= -1;
            }
            if (temp1 == temp2){
                result = mouse;
            }else {
                if (temp1 > temp2){
                    result = catB;
                }else {
                    result = catA;
                }
            }
            System.out.println(result);
        }
    }
}
