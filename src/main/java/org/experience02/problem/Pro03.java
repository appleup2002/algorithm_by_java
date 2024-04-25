package org.experience02.problem;

import org.experience02.tools.FloydWarshall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pro03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pointNum = 5;
        int[][] initMap = {{0, 4, Integer.MAX_VALUE, 6, Integer.MAX_VALUE},
                {4, 0, 3, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 3, 0, 7, Integer.MAX_VALUE},
                {6, Integer.MAX_VALUE, 7, 0, 5},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 5, 0}};

        initMap = FloydWarshall.floydWarshall(initMap);

        int minDis = Integer.MAX_VALUE, sumDis;
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < pointNum; i++) {
            sumDis = Arrays.stream(initMap[i]).reduce(0, Integer::sum);
            System.out.println(sumDis);
            if (sumDis == minDis)
                answer.add(i);

            if (sumDis < minDis) {
                minDis = sumDis;
                answer.clear();
                answer.add(i);
            }

        }
        System.out.println(answer.toString() + "\n" + Arrays.deepToString(initMap));
    }
}
