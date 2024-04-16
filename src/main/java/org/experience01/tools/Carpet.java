package org.experience01.tools;

public class Carpet {
    public static void carpet(int x, int y, int k, int step, int sX, int sY, int eX, int eY){
        int midX = (sX + eX) / 2, midY = (sY + eY) / 2;
        int front = 0, end = 0;
        if (x >= midX + 1)
            front = 1;
        if (y >= midY + 1)
            end = 1;
        int flag = front * 10 + end;
        if(step > k){
            return;
        }
        switch (flag) {
            case 11 -> {
                System.out.println(midX + " " + midY + " " + 4);
                carpet(midX, midY, k, step + 1, sX, sY, midX, midY);
                carpet(midX, midY + 1, k, step + 1, sX, midY + 1, midX, eY);
                carpet(midX + 1, midY, k, step + 1, midX + 1, sY, eX, midY);
                carpet(x, y, k, step + 1, midX + 1, midY + 1, eX, eY);
            }
            case 10 -> {
                System.out.println(midX + " " + (midY + 1) + " " + 3);
                carpet(midX, midY, k, step + 1, sX, sY, midX, midY);
                carpet(midX, midY + 1, k, step + 1, sX, midY + 1, midX, eY);
                carpet(x, y, k, step + 1, (midX) + 1, sY, eX, midY);
                carpet(midX + 1, midY + 1, k, step + 1, (midX) + 1, midY + 1, eX, eY);
            }
            case 1 -> {
                System.out.println((midX + 1) + " " + midY + " " + 2);
                carpet(midX, midY, k, step + 1, sX, sY, midX, midY);
                carpet(x, y, k, step + 1, sX, midY + 1, midX, eY);
                carpet(midX + 1, midY, k, step + 1, (midX) + 1, sY, eX, midY);
                carpet(midX + 1, midY + 1, k, step + 1, (midX) + 1, midY + 1, eX, eY);
            }
            case 0 -> {
                System.out.println((midX + 1) + " " + (midY + 1) + " " + 1);
                carpet(x, y, k, step + 1, sX, sY, midX, midY);
                carpet(midX, midY + 1, k, step + 1, sX, midY + 1, midX, eY);
                carpet(midX + 1, midY, k, step + 1, midX + 1, sY, eX, midY);
                carpet(midX + 1, midY + 1, k, step + 1, midX + 1, midY + 1, eX, eY);
            }
        }
    }
}
