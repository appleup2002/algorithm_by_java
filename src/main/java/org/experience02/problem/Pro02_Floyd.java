package org.experience02.problem;

import org.experience02.tools.FloydWarshall;

import java.util.Arrays;
import java.util.Scanner;

public class Pro02_Floyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pointNum = 5;
        int[][] initMap = {{0, 4, Integer.MAX_VALUE, 6, Integer.MAX_VALUE},
                {4, 0, 3, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 3, 0, 7, Integer.MAX_VALUE},
                {6, Integer.MAX_VALUE, 7, 0, 5},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 5, 0}};

        initMap = FloydWarshall.floydWarshall(initMap);
        int minFar = Integer.MAX_VALUE, hosPosition = -1;
        for (int i = 0; i < pointNum; i++) {
            int maxDis = -1;
            for (int j = 0; j < pointNum; j++) {
                if (initMap[i][j] > maxDis)
                    maxDis = initMap[i][j];
            }
            if(maxDis < minFar){
                minFar = maxDis;
                hosPosition = i;
            }
        }
        System.out.println(hosPosition + 1);
        System.out.println(Arrays.deepToString(initMap));
    }
}
