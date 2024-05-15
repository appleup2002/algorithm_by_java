package org.experience03.tools;

import java.util.List;


public class KnapsackChange {
    public static int knapsackChange(List<List<Integer[]>> entity, int deep, int m, int[][] ans){
        int nowMax = -1;
        for (int i = deep; i > 0; i--) {
            nowMax = -1;
            for (int j = 0; j < entity.get(i - 1).size(); j++){

                int nowValue = entity.get(i - 1).get(j)[1], nowWeight = entity.get(i - 1).get(j)[0];

                int excessWeight = Math.max((m - nowWeight), 0);int nextValue = ans[i][excessWeight];

                while(nextValue < 0 && excessWeight >= 1){
                    nextValue = ans[i][--excessWeight];
                }
                if(ans[i - 1][nowWeight] < nowValue + nextValue){
                    ans[i - 1][nowWeight] = nowValue + nextValue;
                    nowMax = Max.max(ans[i - 1][nowWeight], nowMax);
                }
            }
        }
        return nowMax;
    }
}
