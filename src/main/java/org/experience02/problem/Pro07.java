package org.experience02.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Pro07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleNum = sc.nextInt();

        int[] useTime = new int[peopleNum];
        for (int i = 0; i < peopleNum; i++) {
            useTime[i] = sc.nextInt();
        }
        Arrays.sort(useTime);

        double answer = 0;
        for (int i = 0; i < peopleNum; i++) {
            answer += (peopleNum - i - 1) * useTime[i];
        }
        System.out.printf("%.2f%n", (answer / peopleNum));
    }
}
