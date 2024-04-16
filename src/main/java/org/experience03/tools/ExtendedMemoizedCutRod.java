package org.experience03.tools;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ExtendedMemoizedCutRod {
    public static List<Integer> maxValue = new ArrayList<>(List.of(0));
    public static List<Integer> cutLengths = new ArrayList<>(List.of(0));
    public static Integer extendedMemoizedCutRod(@NotNull List<Integer> value, int rodLength) {
        if (rodLength == 0)
            return 0;
        if (maxValue.size() - 1 >= rodLength) {
            return value.get(rodLength);
        }
        int q = -1, cutLength = -1;
        for (int i = 1; i <= rodLength; i++) {
            int newLength = value.get(i) + extendedMemoizedCutRod(value, rodLength - i);
            if(q < newLength){
                q = newLength;
                cutLength = i;
            }
        }
        maxValue.add(rodLength, q);
        cutLengths.add(rodLength, cutLength);
        return value.get(rodLength);
    }
}
