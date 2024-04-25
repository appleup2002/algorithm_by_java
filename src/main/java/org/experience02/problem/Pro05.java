package org.experience02.problem;

import org.experience02.pojo.Activity;

import java.util.Arrays;
import java.util.Scanner;

public class Pro05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actNum = sc.nextInt();

        Activity[] activities = new Activity[actNum];

        for (int i = 0; i < actNum; i++)
            activities[i] = new Activity(sc.nextInt(), sc.nextInt());

        Arrays.sort(activities);

        int nowEnd = -1, answer = 0;
        for (int i = 0; i < actNum; i++) {
            if(activities[i].getStart() >= nowEnd){
                answer++;
                nowEnd = activities[i].getEnd();
            }
        }
        System.out.println(answer);
    }


}
