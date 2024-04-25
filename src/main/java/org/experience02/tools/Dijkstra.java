package org.experience02.tools;

import java.util.Arrays;

public class Dijkstra {
    public static int[][] dijkstra(int [][] initMap, int[][] mapDistance){
        int pointNum = initMap.length;
        for (int i = 0; i < pointNum; i++) {

            boolean[] visit = new boolean[pointNum];
            Arrays.fill(visit, false);

            visit[i] = true;
            mapDistance[i][i] = 0;
            int nowPoint = i;

            for (int j = 0; j < pointNum; j++) {
                for (int k = 0; k < pointNum; k++) {
                    if(initMap[nowPoint][k] < Integer.MAX_VALUE && mapDistance[i][k] > mapDistance[i][nowPoint] + initMap[nowPoint][k]){
                        mapDistance[i][k] = mapDistance[i][nowPoint] + initMap[nowPoint][k];
                    }
                }

                nowPoint = getClosePoint(mapDistance[i], visit);
                visit[nowPoint] = true;
            }
        }
        return mapDistance;
    }

    public static int getClosePoint(int[] map, boolean[] visit){
        int pointNum = visit.length, minPos = 0, minDis = Integer.MAX_VALUE;

        for (int i = 0; i < pointNum; i++) {
            if(map[i] < minDis && !visit[i]){
                minPos = i;
                minDis = map[i];
            }
        }
        return minPos;
    }
}
