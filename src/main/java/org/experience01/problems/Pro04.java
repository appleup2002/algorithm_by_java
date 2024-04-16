package org.experience01.problems;

import java.util.Scanner;

public class Pro04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        Integer[] nums1 = new Integer[n1];
        Integer[] nums2 = new Integer[n2];
        for(int i = 0; i < n1; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            nums2[i] = sc.nextInt();
        }
        if(nums1[n1 - 1] + nums2[0] < 10000){
            System.out.println("NO");
        }
        else{
            int flag1 = 0,flag2 =0;
            while(true){
                if(nums1[flag1] + nums2[flag2] == 10000){
                    System.out.println("YES");
                    break;
                }else if(nums1[flag1] + nums2[flag2] > 10000){
                    flag2++;
                }else if(nums1[flag1] + nums2[flag2] < 10000){
                    flag1++;
                }
                if(flag1 >= n1 || flag2 >=n2){
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}
//5 5 1001 2001 3000 4001 5001 10001 9001 8001 7000 6001
