package org.experience03.learn;

import org.experience03.tools.RodCutWithCost;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class learn01_Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> value = new ArrayList<>(List.of(0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30));
        int maxLength =  sc.nextInt(), cost = sc.nextInt();

        System.out.println(RodCutWithCost.rodCutWithCost(value, maxLength, cost));
        while(maxLength > 0){
            System.out.println(RodCutWithCost.cutLengths.get(maxLength));
            maxLength -= RodCutWithCost.cutLengths.get(maxLength);
        }
    }

}
