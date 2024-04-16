package org.experience03.tools;

import org.jetbrains.annotations.NotNull;

import static org.experience03.tools.Max.max;

import java.util.ArrayList;
import java.util.List;

public class MemoizedCutRod {
    public static List<Integer> maxValue = new ArrayList<>(List.of(0));
    public static Integer memoizedCutRod(@NotNull List<Integer> value, int rodLength) {
        if(rodLength == 0)
            return 0;
        if (maxValue.size() - 1 >= rodLength) {
            return maxValue.get(rodLength);
        }
        int q = -1;
        for (int i = 1; i <= rodLength; i++) {
            q = Max.max(q, value.get(i) + memoizedCutRod(value, rodLength - i));
        }
        maxValue.add(rodLength, q);
        return maxValue.get(rodLength);
    }
}
