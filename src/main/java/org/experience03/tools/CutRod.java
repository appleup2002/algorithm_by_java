package org.experience03.tools;
import java.util.List;

import static org.experience03.tools.Max.max;

public class CutRod {
    public static int cutRod(List<Integer> value, int rodLength){
        if(rodLength == 0){
            return 0;
        }
        int q = -1;
        for (int i = 1; i <= rodLength; i++) {
            q = Max.max(q, value.get(i) + cutRod(value, rodLength - i));
        }
        return q;
    }
}
