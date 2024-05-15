package org.experience03.problem;

import org.experience03.tools.BottomUpCutRod;
import org.experience03.tools.CutRod;
import org.experience03.tools.Invest;
import org.experience03.tools.Max;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pro01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> ls = new ArrayList<>();
            for (int j = 0; j <= m; j++) {
                ls.add(sc.nextInt());
            }
            g.add(ls);
        }
        int[][] ans = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(ans[i], 0);
        }

        System.out.println(Invest.invest(g, ans, m));
    }
}
