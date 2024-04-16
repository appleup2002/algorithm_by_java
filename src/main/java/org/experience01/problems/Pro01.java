package org.experience01.problems;

import org.experience01.tools.BinarySearch;
import org.experience01.tools.MergeSort;
import org.experience01.Pojo.Student;

import java.util.Scanner;

public class Pro01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
3
软件专业
吴东 18160235 19
李丽 18160304 12
王达 18160112 18
3
计算机专业:
董倩 18260123 14
李大 18260302 11
陈曦 18260122 13
13
 */
        Student[] students = {
                new Student("软件专业", "吴东", 18160235, 19),
                new Student("软件专业", "李丽", 18160304, 12),
                new Student("软件专业", "王达", 18160112, 18),
                new Student("计算机专业", "董倩", 18260123, 14),
                new Student("计算机专业", "李大", 18260302, 11),
                new Student("计算机专业", "陈曦", 18260122, 13),
        };
        int[] j = {3, 3,-1};
//        j[2] = -1;
        int  sum = 6;
        String[] majors= {"软件专业", "计算机专业"};

        Integer[] test = new Integer[50];
        for (int i = 0; i < 50; i++) {
            test[i] = i;
        }
        MergeSort.mergeSort(students, test,0,sum-1);
        for(int i = 0; i < sum; i++){
            System.out.println(students[test[i]].toString());
        }
        if(BinarySearch.binarySearch(students, test, 14, 0, sum-1, 1) < 0){
            System.out.println("植树数量不存在");
        }
    }
}
