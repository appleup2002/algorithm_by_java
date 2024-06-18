package org.experience04.problem;

import java.util.ArrayList;
import java.util.Arrays;

public class Pro03 {
    public static void pro03(int n, int[] nums){
        for (int i = 0; i < n; i++) {
            ArrayList<ArrayList<Integer>> allAns = Pro05.pro05(nums[i], nums);
            for (ArrayList<Integer> ans : allAns) {
                for (int k =0; k < ans.size() - 1; k++) {
                    System.out.print(ans.get(k) + " + ");
                }
                System.out.println(ans.get(ans.size() - 1) + " = " + nums[i]);
            }
        }
    }
}
