package org.experience03.tools;

import java.util.Arrays;

public class GetLCS {
    public static int[][] getLCS(String X, String Y) {

        int xLength = X.length(), yLength = Y.length();
        char[] x = (" " +X).toCharArray(), y = (" " + Y).toCharArray();

        int[][] ans = new int[xLength + 1][yLength + 1];
        Arrays.fill(ans[0], 0);
        for (int i = 0; i < xLength + 1; i++)
            ans[i][0] = 0;

        for (int i = 1; i < xLength + 1; i++) {
            for (int j = 1; j < yLength + 1; j++) {
                if (x[i] == y[j])
                    ans[i][j] = ans[i - 1][j - 1] + 1;
                else if (ans[i - 1][j] >= ans[i][j - 1])
                    ans[i][j] = ans[i - 1][j];
                else ans[i][j] = ans[i][j - 1];
            }
        }

        return ans;
    }
}


