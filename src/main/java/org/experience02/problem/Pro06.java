package org.experience02.problem;

import java.util.*;

public class Pro06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int heapNum = sc.nextInt();
        List<Integer> heaps= new ArrayList<>(0);

        for (int i = 0; i < heapNum; i++) {
            heaps.add(sc.nextInt());
        }
        int answer = 0, min_1;
        while (heaps.size() >= 2){

            min_1 = Collections.min(heaps);
            heaps.remove((Integer) min_1);
            answer += min_1;
            int sum = min_1;

            min_1 = Collections.min(heaps);
            heaps.remove((Integer) min_1);
            answer += min_1;

            heaps.add(sum + min_1);
        }
        System.out.println(answer);

    }
    }
