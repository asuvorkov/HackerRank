package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 15.08.2017.
 */
public class MagicSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int output = 10000;
        int[] input = new int[9];
        for(int i = 0; i < 9; i++) {
            input[i] = in.nextInt();
        }
        int [][] magic =   {{8, 1, 6, 3, 5, 7, 4, 9, 2},
                            {4, 3, 8, 9, 5, 1, 2, 7, 6},
                            {2, 9, 4, 7, 5, 3, 6, 1, 8},
                            {6, 7, 2, 1, 5, 9, 8, 3, 4},
                            {6, 1, 8, 7, 5, 3, 2, 9, 4},
                            {8, 3, 4, 1, 5, 9, 6, 7, 2},
                            {4, 9, 2, 3, 5, 7, 8, 1, 6},
                            {2, 7, 6, 9, 5, 1, 4, 3, 8}};

        for (int a = 0; a < 8; a++){
            int temp = 0;
            for (int b = 0; b < 9; b++){
                if (magic [a][b] - input[b] > 0){
                    temp += magic [a][b] - input[b];
                } else {
                    temp += input[b] - magic [a][b];
                }
            }
            if (temp < output){
                output = temp;
            }
        }
        //  Print the minimum cost of converting 's' into a magic square
        System.out.println(output);
    }
}
