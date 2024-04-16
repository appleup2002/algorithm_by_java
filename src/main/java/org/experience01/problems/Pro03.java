package org.experience01.problems;

import org.experience01.tools.BoxMove;

import java.util.Arrays;
import java.util.Scanner;

public class Pro03 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        Integer[] boxes = new Integer[2 * x + 2];
        boxes[2 * x] = 0;
        boxes[2 * x + 1] = 0;
        for (int i = 0; i < x; i++) {
            boxes[i] = 1;
            boxes[x + i] = 2;
        }
        System.out.println(Arrays.toString(boxes));
        BoxMove.boxMove(boxes, x);

    }
}
