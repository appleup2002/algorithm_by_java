package org.experience01.tools;

import org.experience01.Pojo.Student;

import java.util.Objects;

public class BinarySearch {
    public static Integer binarySearch(Student[] students, Integer[] array, Integer target, int left, int right, int time){
        int mid = (left + right) / 2;
        if(left > right)
            return -1;
        if(Objects.equals(students[array[mid]].getTreeMount(), target)){
            System.out.println("排名是" + mid + "查找次数为" + time + students[array[mid]].toString());
        return mid;
        }else if (students[array[mid]].getTreeMount() < target) {
            return binarySearch(students, array, target, mid + 1, right, time + 1);
        } else if (students[array[mid]].getTreeMount() > target) {
            return binarySearch(students, array, target, left, mid-1, time + 1);
        }
        return -1;
    }
}
