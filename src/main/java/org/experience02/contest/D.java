package org.experience02.contest;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int totalNeed = 0;
        for (int i = 0; i < m; i++) {
            totalNeed += sc.nextInt();
        }
        System.out.println((int)(Math.pow(m, (n - totalNeed - m)) % 1000000007));
    }
}
