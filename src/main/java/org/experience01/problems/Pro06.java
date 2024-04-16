package org.experience01.problems;

import org.experience01.tools.Carpet;

import java.util.Scanner;

public class Pro06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        Carpet.carpet(x,y,k,1, 1, 1, (int)Math.pow(2, k), (int)Math.pow(2, k));
    }
}
