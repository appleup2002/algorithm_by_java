package org.experience04.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pro01 {
    //    01bag
    public static void pro01(int m, int n, int items[][]) {

        boolean[][] isView = new boolean[n][2];
        for (int i = 0; i < n; i++) {
            Arrays.fill(isView[i], false);
        }

        int nowWeight = 0, nowValue = 0, maxValue = Integer.MIN_VALUE;

        for (int i = 0; i > -1; i++) {

            if (!isView[i][0]) {

                nowWeight += items[i][0];
                if (nowWeight > m) {
                    if (nowValue > maxValue) {
                        maxValue = nowValue;
                    }
                    isView[i][0] = false;
                    isView[i][1] = false;
                    nowWeight -= items[i][0];
                    i -= 2;
                    continue;
                }
                nowValue += items[i][1];
                isView[i][0] = true;
            } else if (!isView[i][1]) {
                nowWeight -= items[i][0];
                nowValue -= items[i][1];
                isView[i][1] = true;
            } else{
                isView[i][0] = false;
                isView[i][1] = false;
                nowWeight -= items[i][0];
                nowValue -= items[i][1];
                i -= 2;
            }

            if (i == n -1)
                i -= 1;

        }

        System.out.println(maxValue);

    }

}

