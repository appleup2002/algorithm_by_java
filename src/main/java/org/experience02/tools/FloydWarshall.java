package org.experience02.tools;

public class FloydWarshall {
    public static int[][] floydWarshall(int[][] map) {
        int vNum = map.length;
        for (int mid = 0; mid < vNum; mid++) {
            for (int start = 0; start < vNum; start++) {
                for (int end = 0; end < vNum; end++) {
                    if(map[start][mid] < Integer.MAX_VALUE && map[mid][end] < Integer.MAX_VALUE && map[start][end] > map[start][mid] + map[mid][end])
                        map[start][end] = map[start][mid] + map[mid][end];
                }
            }
        }
        return map;
    }
}
