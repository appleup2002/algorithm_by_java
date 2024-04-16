package org.experience01.problems;

import org.experience01.tools.Totem;

import java.util.Arrays;
import java.util.Scanner;

public class Pro05 {
    public static void main(String[] args) {
        int layer = new Scanner(System.in).nextInt();
        int scale = (int)Math.pow(2, layer);
        char[][] graphics = new char[scale][2 * scale];
        for(int i = 0; i < scale; i++)
            Arrays.fill(graphics[i], ' ');
        Totem.totem(0, scale - 1, layer, scale - 1,graphics);
        for(int j = 0; j < scale; j++){
            for (int i = 0; i < 2 * scale; i++) {
                System.out.print(graphics[j][i]);
            }
            System.out.println();
        }
    }
}
