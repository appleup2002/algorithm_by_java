package org.experience02.problem;

import java.util.ArrayList;
import java.util.List;

public class Pro01 {
    public static void main(String[] args) {

//        100,400,800,1200,1600,2000,2400,2800,3200,3600,4000,4400,4800,5200,5600,6000,6400,6800,7200,7600
//        100,200,400,600,800,1000,1200,1400,1600,1800,2000,2200
        List<Integer> positions = new ArrayList<>(List.of(100,400,800,1200,1600,2000,2400,2800,3200,3600,4000,4400,4800,5200,5600,6000,6400,6800,7200,7600)),
        postPositions = new ArrayList<>(List.of(positions.get(0) + 1000));
        int postMount = 1, postPosition = positions.get(0) + 1000;
        boolean status = false;

        for(int i = 1; i < positions.size(); i++){

            if (positions.get(i) > postPosition + 1000){
                postMount++;
                postPosition = positions.get(i) + 1000;

                if(postPosition > positions.get(positions.size() - 1)){
                    postPosition = positions.get(positions.size() - 1);
                    postPositions.add(postPosition);
                    break;
                }
                postPositions.add(postPosition);
            }
        }
        System.out.println(postMount + "\n" + postPositions.toString());
    }
}
