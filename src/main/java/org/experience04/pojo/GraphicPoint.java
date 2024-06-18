package org.experience04.pojo;

import java.util.Arrays;

public class GraphicPoint {
    private int order;
    private int time;
    private int coin;
    private int pointNum;
    private GraphicPoint[] points;
    private boolean[] isVisit = new boolean[pointNum];

    public void emptyVisit(){
        Arrays.fill(isVisit, false);
    }

    public int findPoint(){
        for (int i = 0; i < pointNum; i++) {
            if (!isVisit[i]) {
                isVisit[i] = true;
                return i;
            }
        }
        return -1;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public GraphicPoint(int order, int time, int coin, int pointNum, GraphicPoint[] points) {
        this.order = order;
        this.time = time;
        this.coin = coin;
        this.pointNum = pointNum;
        this.points = points;
        Arrays.fill(this.isVisit, false);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getPointNum() {
        return pointNum;
    }

    public void setPointNum(int pointNum) {
        this.pointNum = pointNum;
    }

    public GraphicPoint[] getPoints() {
        return points;
    }

    public void setPoints(GraphicPoint[] points) {
        this.points = points;
    }

    public GraphicPoint() {
    }

    public GraphicPoint(int time, int coin, int pointNum, GraphicPoint[] points) {
        this.time = time;
        this.coin = coin;
        this.pointNum = pointNum;
        this.points = points;
    }
}
