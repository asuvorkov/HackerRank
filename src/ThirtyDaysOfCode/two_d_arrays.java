package ThirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Andrei on 15.07.2017.
 */
public class two_d_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int summ = -1000;
        for (int y = 0; y < 4; y++){
            for (int x = 0; x < 4; x++){
                int temp = arr[y][x] + arr[y][x + 1] + arr[y][x + 2] + arr[y + 1][x + 1] +arr[y + 2][x] + arr[y + 2][x + 1] + arr[y + 2][x + 2];
                if (temp > summ){
                    summ = temp;
                }
            }
        }
        System.out.println(summ);
    }
}
