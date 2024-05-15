package org.experience03.problem;

import org.experience03.tools.KnapsackChange;

import java.util.*;

public class Pro05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n =sc.nextInt(), last = 1;
        List<List<Integer[]>> entity = new ArrayList<>();

        for (int i = 0; i < n; i++){
            Integer[] attr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            if(entity.size() < attr[2])
                entity.add(new ArrayList<>());
            entity.get(attr[2] - 1).add(attr);
            last = attr[2];
        }

        int[][] ans = new int[last + 1][200];

        for (int i = 0; i < ans.length; i++){
            Arrays.fill(ans[i], -1);
            ans[i][0] = 0;
        }
        Arrays.fill(ans[last], 0);

        System.out.println(KnapsackChange.knapsackChange(entity, last, m, ans));

    }
}
