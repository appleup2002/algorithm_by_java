package org.experience03.learn;

import org.experience03.tools.*;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Learn01_Profit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> value = new ArrayList<>(List.of(0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30));

        System.out.println(CutRod.cutRod(value, sc.nextInt()));
        value.subList(11,value.size()).clear();

        System.out.println(MemoizedCutRod.memoizedCutRod(value, sc.nextInt()));
        value.subList(11,value.size()).clear();

        System.out.println(BottomUpCutRod.bottomUpCutRod(value, sc.nextInt()));
        value.subList(11,value.size()).clear();

    }
}
