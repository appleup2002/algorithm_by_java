package org.experience04.problem;

import java.util.Arrays;
import java.util.Stack;

public class Pro02 {
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

    public static void pro02(int n, int[][] positions){

        Stack<Integer> prePoses = new Stack<>();
        boolean[] isVisit = new boolean[n];
        Arrays.fill(isVisit, false);

        boolean[][] visitOrder = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(visitOrder[i], false);
        }

        int minCost = Integer.MAX_VALUE, cost = 0;

        for (int i = 0; i > -1 ; i++) {

            if (findPlace(isVisit, visitOrder[i]) == -1){
                if (prePoses.size() == 0){
                    break;
                }
                int nowPos = prePoses.pop();
                isVisit[nowPos] = false;
                if (prePoses.size() > 0)
                    cost -= positions[prePoses.peek()][nowPos];
                Arrays.fill(visitOrder[i], false);
                i -= 2;
                continue;
            }

            int nowPos = findPlace(isVisit, visitOrder[i]);
            int prePos = i == 0 ? nowPos : prePoses.peek();

            isVisit[nowPos] = true;
            visitOrder[i][nowPos] = true;
            cost += positions[prePos][nowPos];

            if (cost > minCost){
                cost -= positions[prePoses.pop()][nowPos];
                cost -= positions[prePoses.peek()][prePos];
                isVisit[nowPos] = false;
                isVisit[prePos] = false;
                Arrays.fill(visitOrder[i], false);
                i -= 2;
                prePoses.pop();
                continue;
            }
            if(i == n-1){
                if (cost + positions[nowPos][prePoses.elementAt(0)] < minCost){
                    minCost = cost + positions[nowPos][prePoses.elementAt(0)];
                }
                isVisit[nowPos] = false;
                isVisit[prePos] = false;
                cost -= positions[prePoses.pop()][nowPos];
                cost -= positions[prePoses.peek()][prePos];
                Arrays.fill(visitOrder[i], false);
                i -= 2;
                continue;
            }
            prePoses.push(nowPos);
        }
        System.out.printf(minCost + "\n");

    }
}
