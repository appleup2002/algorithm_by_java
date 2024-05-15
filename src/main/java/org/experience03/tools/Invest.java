package org.experience03.tools;

import java.util.List;

public class Invest {
    public static int invest(List<List<Integer>> g, int [][] ans,int m){
        int maxAns = 0;
        for (int i = g.size(); i > 0; i--) {
                maxAns = 0;
            for (int j = 1; j <= m; j++) {
                for (int k = 0; k <= j; k++) {
                    ans[i - 1][j] = Max.max(ans[i-1][j],ans[i][j - k] + g.get(i - 1).get(k));
                    maxAns = Max.max(ans[i][j - k] + g.get(i - 1).get(k), maxAns);
                }
            }
        }
        return maxAns;
    }
}
