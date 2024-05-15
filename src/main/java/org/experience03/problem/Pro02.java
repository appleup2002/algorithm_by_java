package org.experience03.problem;

import org.experience03.tools.GetLCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pro02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.nextLine(), Y = sc.nextLine();
        System.out.println(Y);
        for (int i = 0; i < X.length() + 1; i++) {
            System.out.println(Arrays.toString(GetLCS.getLCS(X, Y)[i]));
        }
    }
}
