package Algorithms.Implementation.easy;

import java.util.*;

/**
 * Created by Andrei on 19.08.2017.
 */
public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        // your code goes here
        int[] rank = new int[n];
        rank[0] = 1;
        for(int i=1;i<n;i++){
            if(scores[i] < scores[i-1]){
                rank[i] = rank[i-1] + 1;
            }else{
                rank[i] = rank[i-1];
            }
        }
        int k=n-1;
        for(int i=0;i<m;i++){

            while(k>=0 && alice[i] >= scores[k])
                k--;

            if(k >= 0)
                System.out.println(rank[k]+1);
            else
                System.out.println("1");
        }
    }
}
