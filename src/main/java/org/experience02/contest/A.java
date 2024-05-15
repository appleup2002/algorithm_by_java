package org.experience02.contest;

import java.util.*;

public class A {

    public static int findMax(int[] a, int n){
        int max = -1, ans = -1;
        for (int i = 1; i <= n; i++) {
            if(a[i] > max){
                max = a[i];
                ans = i;
            }
        }
        return ans;
    }

    public static int findMin(int[][] ab, int maxPerson, int n, int nowTic, int maxTic){
        int min = Integer.MAX_VALUE, ans = 0;

        for(int i = 1; i <= n; i++){
            int prace = ab[i][0];
            if(i == maxPerson && maxTic - nowTic > 1){
                prace /= 2;
            }
            if(prace < min){
                min = prace;
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] ab = new int[1001][2002];
        int[] a = new int[1001];

        Arrays.fill(a, 0);

        for (int i = 0; i <= n; i++){
            Arrays.fill(ab[i], Integer.MAX_VALUE);
        }

        for (int i = 0; i < m; i++){
            int cost = sc.nextInt();
            int person = sc.nextInt();
            ab[person][a[person]] = cost;
            a[person]++;
        }

        for (int i = 0; i <= n; i++) {
            Arrays.sort(ab[i]);
        }

        int nowTic =0, totalCost = 0;
        int nowMax = findMax(a, n);
        int maxTic = a[nowMax];
        for (int i = 0; nowTic <= maxTic; i++) {
            int nowMin = findMin(ab, nowMax, n, nowTic, maxTic);
            totalCost += ab[nowMin][0];
            nowTic++;
            a[nowMin]--;
            if(nowMin == nowMax){
                nowMax = findMax(a, n);
                maxTic = a[nowMax];
            }
            ab[nowMin][0] = Integer.MAX_VALUE;
            Arrays.sort(ab[nowMin]);
        }

        System.out.println(totalCost);

    }
}
