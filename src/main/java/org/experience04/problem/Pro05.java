package org.experience04.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro05 {
    public static ArrayList pro05(int tar, int[] nums){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[][] isView = new boolean[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(isView[i], false);
        }

        int nowValue = 0;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i > -1; i++) {

            if (!isView[i][0]) {
                isView[i][0] = true;

            }
            else if(!isView[i][1]){
                nowValue += nums[i];
                isView[i][1] = true;
                temp.add(nums[i]);

                if(nowValue >= tar){
                    if(nowValue == tar && temp.size() > 1){
                        ArrayList<Integer> tempAns = new ArrayList<>(temp);
                        ans.add(tempAns);
                    }
                    temp.remove(temp.size()-1);

                    isView[i][0] = false;
                    isView[i][1] = false;
                    nowValue -= nums[i];
                    i -= 2;
                }
            }else{

                temp.remove(temp.size()-1);

                isView[i][0] = false;
                isView[i][1] = false;
                nowValue -= nums[i];
                i -= 2;

            }
            if (i == nums.length - 1){
                i -= 1;
            }
        }
//        for (int i = 0; i < ans.size(); i++){
//            System.out.println(ans.get(i).toString());
//        };
        return ans;
    }
}
