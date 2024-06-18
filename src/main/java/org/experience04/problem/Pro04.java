package org.experience04.problem;


import java.util.Arrays;
import java.util.Stack;


public class Pro04 {

    public static int findPlace(boolean[] isVisit, boolean[] nowPosition) {
        int ans = -1;
        for (int i = 0; i < isVisit.length; i++) {
            if(!isVisit[i] && !nowPosition[i]) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void pro04(int n, int m, int[][] positions, int[][] values){
        Stack<Integer> prePoses = new Stack<>();
        boolean[] isVisit = new boolean[n];
        Arrays.fill(isVisit, false);

        boolean[][] visitOrder = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(visitOrder[i], false);
        }

        int minCost = Integer.MAX_VALUE, cost = 0;

        System.out.printf(minCost + "\n");
    }
}
