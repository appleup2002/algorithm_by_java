package org.experience01.tools;

public class Totem {
    public static void totem(int start, int end, int scale, int pos, char[][] graphics){
        if(scale == 1){
            graphics[start][pos] = '/';
            graphics[start][pos + 1] = '\\';
            graphics[start + 1][pos - 1] = '/';
            graphics[start + 1][pos + 2] = '\\';
            graphics[start + 1][pos] = '_';
            graphics[start + 1][pos + 1] = '_';
        }
        else{
           totem(start, (start + end) / 2, scale - 1, pos, graphics);
           totem((start + end) / 2 + 1, end, scale - 1, pos - (int)Math.pow(2, scale - 1), graphics);
           totem((start + end) / 2 + 1, end, scale - 1, pos + (int)Math.pow(2, scale - 1), graphics);
        }
    }
}
