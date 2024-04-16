package org.experience01.tools;

import java.util.Arrays;

public class BoxMove {
    public static void boxMove(Integer[] boxes, int x){
        for(int i = 1; i < x; i++){
            boxes[2 * (x - i) + 2] = boxes[x - i];
            boxes[2 * (x - i) + 3] = boxes[x - i + 1];
            boxes[x - i] = -1;
            boxes[x - i + 1] = -1;
            boxes[x - i] = boxes[2 * (x - i)];
            boxes[2 * (x - i)] = -1;
            boxes[x - i + 1] = boxes[2 * (x - i) + 1];
            boxes[2 * (x - i) + 1] = -1;
            System.out.println(Arrays.toString(boxes));
        }
        boxes[3] = boxes[2];
        boxes[2] = boxes[0];
        boxes[0] = -1;
        System.out.println(Arrays.toString(boxes));
    }
}
