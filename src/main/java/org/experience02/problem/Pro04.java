package org.experience02.problem;

import org.experience02.pojo.Minister1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Pro04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int miniNum = sc.nextInt();
        BigDecimal left = sc.nextBigDecimal();
        BigDecimal right = sc.nextBigDecimal();
        Minister1[] ministers = new Minister1[miniNum];

        for (int i = 0; i < miniNum; i++) {
            ministers[i] = new Minister1(sc.nextBigDecimal(),sc.nextBigDecimal());
        }
        Arrays.sort(ministers);

        BigDecimal maxPro = BigDecimal.valueOf(-1);
        BigDecimal finalGift = new BigDecimal(left.longValue());

        for (int i = 0; i < miniNum; i++) {

            if(finalGift.divide(ministers[i].getRight(), RoundingMode.FLOOR).compareTo(maxPro) > 0){
                maxPro = finalGift.divide(ministers[i].getRight(), RoundingMode.FLOOR);
            }
            finalGift = finalGift.multiply(ministers[i].getLeft());
        }
        System.out.println(maxPro);
    }
}
