import org.experience03.problem.*;
import org.experience04.problem.Pro01;
import org.experience04.problem.Pro02;
import org.experience04.problem.Pro03;
import org.experience04.problem.Pro05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int m = 20, n = 4;
        int[][] items = {{4, 8}, {9, 15}, {12, 20}, {15, 25}};
        Pro01.pro01(m, n, items);

        n = 4;
        int[][] positions = {
                {0, 4, 1, 3},
                {4, 0, 2, 1},
                {1, 2, 0, 5},
                {3, 1, 5, 0}
        };

        Pro02.pro02(n, positions);

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Pro03.pro03(15, nums);

        int tar = 7;
        int[] nums_2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Pro05.pro05(tar, nums_2);

    }
}