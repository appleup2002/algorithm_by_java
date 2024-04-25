package org.experience02.problem;

import org.experience02.tools.Dijkstra;

import java.util.Arrays;
import java.util.Scanner;

public class Pro02_Dijkstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pointNum = 5;
        int[][] initMap = {{0, 4, Integer.MAX_VALUE, 6, Integer.MAX_VALUE},
                {4, 0, 3, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 3, 0, 7, Integer.MAX_VALUE},
                {6, Integer.MAX_VALUE, 7, 0, 5},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 5, 0}},
        mapDistance = new int[pointNum][pointNum];

        for (int i = 0; i < pointNum; i++) {
            Arrays.fill(mapDistance[i], Integer.MAX_VALUE);
        }

        mapDistance = Dijkstra.dijkstra(initMap, mapDistance);

        System.out.println(Arrays.deepToString(mapDistance));
    }
}
