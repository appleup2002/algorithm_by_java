package org.experience01.tools;

import org.experience01.Pojo.Student;

public  class MergeSort {
    private static void merge(Student[] students, Integer[] target, Integer start, Integer midst, Integer end){
        int flag1 = target[start], flag2 = target[midst];
        int l1 = midst - start, l2 = end - midst + 1, num1 = students[flag1].getTreeMount(), num2 = students[flag2].getTreeMount();

        Integer[] temp = new Integer[end - start + 1];

        System.arraycopy(target, start, temp, 0, end - start + 1);

        for(int i = 0;; i++){
            if(num1 < num2){
                target[start + i] = flag1;
                l1 -= 1;
                if(l1 == 0){
                    System.arraycopy(temp, end - start + 1 - l2, target, end + 1 - l2, l2);
                    break;
                }
                flag1 = temp[midst - start - l1];
                num1 = students[flag1].getTreeMount();
            }else{
                target[start + i] = flag2;
                l2 -= 1;
                if(l2 == 0){
                    System.arraycopy(temp, midst - start - l1, target, end + 1 - l1, l1);
                    break;
                }
                flag2 = temp[end - start + 1 - l2];
                num2 = students[flag2].getTreeMount();
            }
        }
    }

    public static void mergeSort(Student[] students, Integer[] target, Integer start, Integer end){
        if(start < end){
            mergeSort(students, target, start, (start + end) / 2);
            mergeSort(students, target, (start + end) / 2 + 1, end);
            merge(students, target, start, (start + end) / 2 + 1, end);
        }
    }
}
