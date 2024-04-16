package org.experience03.tools;

import java.util.ArrayList;
import java.util.List;

public class ExtendedBottomUpCutRod {
    public static List<Integer> cutLengths = new ArrayList<>(List.of(0));
    public static List<Integer> extendedBottomUpCutRod(List<Integer> value, int rodLength){
        int valueLength = value.size() - 1;
        for (int i = 1; i <= rodLength; i++){
            int q = -1, cutLength = -1;
            for (int j = 1; j <= i && j <= valueLength; j++) {
                if(q  < value.get(j) + value.get(i - j)){
                    q = value.get(j) + value.get(i - j);
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
        return cutLengths;
    }
}
