package org.experience02.contest;

import java.util.Arrays;
import java.util.Scanner;

public class E {
    public static int findMin(int[] ansTimes, int m){
        int min = Integer.MAX_VALUE, ans = 0;
        for (int i = 0; i < m; i++) {
            if(min > ansTimes[i]){
                min = ansTimes[i];
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] time = new int[n];
        int[] ansTimes = new int[m];
        Arrays.fill(ansTimes, 0);
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);
        int ansTime = 0;
        for (int i = 0; i < n; i++) {
            int now = findMin(ansTimes, m);
            ansTimes[now] += time[i];
            ansTime +=ansTimes[now];
        }
        System.out.println(ansTime);

    }
}
