package org.experience03.tools;

import java.util.ArrayList;
import java.util.List;

public class RodCutWithCost {
    public static List<Integer> cutLengths = new ArrayList<>(List.of(0));
    public static Integer rodCutWithCost(List<Integer> value, int rodLength, int cost){

        int valueLength = value.size() - 1;

        for (int i = 1; i <= rodLength; i++){

            int q = -1, cutLength = -1;

            for (int j = 1; j <= i && j <= valueLength; j++) {
                if(i == j && q < value.get(j)){
                    q = value.get(j);
                    cutLength = j;
                }
                else if(q < value.get(j) + value.get(i - j) - cost){
                    q = value.get(j) + value.get(i - j) - cost;
                    cutLength = j;
                }

            }

            if(value.size() - 1 >= i)
                value.set(i, q);
            else{
                value.add(i, q);
                valueLength++;
            }
            cutLengths.add(i, cutLength);
        }
        return value.get(rodLength);
    }
}
