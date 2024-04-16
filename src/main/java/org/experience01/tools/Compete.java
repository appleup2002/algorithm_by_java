package org.experience01.tools;

import java.util.Arrays;

public class Compete {
    public static void swap(Integer[] rivals, int start, int stepLength){
        Integer[] temp = new Integer[stepLength];
        System.arraycopy(rivals, start, temp, 0, stepLength);
        System.arraycopy(rivals, start + stepLength, rivals, start,stepLength);
        System.arraycopy(temp, 0, rivals, start + stepLength, stepLength);
    }
    public static void compete(Integer[] rivals, int stepLength, int length){
        int flag = 0;
        if(stepLength == 1){
            System.out.println(Arrays.toString(rivals));
        }
        else{
            compete(rivals, stepLength / 2, length);
            for (int i = 0; i < length / stepLength; i++) {
                swap(rivals, flag, stepLength/2);
                flag += stepLength;
            }
            compete(rivals, stepLength / 2, length);
            flag = 0;
            for (int i = 0; i < length / stepLength; i++) {
                swap(rivals, flag, stepLength/2);
                flag += stepLength;
            }
    }
    }
}
