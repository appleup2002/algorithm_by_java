package org.experience03.tools;

import java.util.List;


public class BottomUpCutRod {
    public static Integer bottomUpCutRod(List<Integer> value, int rodLength){
        int valueLength = value.size() - 1;
        for (int i = 1; i <= rodLength; i++){
            int q = -1;
            for (int j = 1; j <= i && j <= valueLength; j++) {
                q = Max.max(q, value.get(j) + value.get(i - j));
            }
            if(value.size() - 1 >= i)
                value.set(i, q);
            else{
                value.add(i, q);
                valueLength++;
            }
        }
        return value.get(rodLength);
    }
}
