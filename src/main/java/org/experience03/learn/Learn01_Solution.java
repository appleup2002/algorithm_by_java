package org.experience03.learn;

import org.experience03.tools.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Learn01_Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> value = new ArrayList<>(List.of(0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30));
        int maxLength = sc.nextInt();

        ExtendedMemoizedCutRod.extendedMemoizedCutRod(value,maxLength);

        value.subList(11,value.size()).clear();
        while(maxLength > 0){
            System.out.println(ExtendedMemoizedCutRod.cutLengths.get(maxLength));
            maxLength -= ExtendedMemoizedCutRod.cutLengths.get(maxLength);
        }

        List<Integer> cutLengths = ExtendedBottomUpCutRod.extendedBottomUpCutRod(value, maxLength = sc.nextInt());

        while(maxLength > 0){
            System.out.println(cutLengths.get(maxLength));
            maxLength -= cutLengths.get(maxLength);
        }
    }
}
