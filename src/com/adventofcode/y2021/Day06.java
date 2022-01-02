package com.adventofcode.y2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Day06 {

    public static final String SAMPLE_INPUT = "3,4,3,1,2";
    public static final String INPUT = "5,1,5,3,2,2,3,1,1,4,2,4,1,2,1,4,1,1,5,3,5,1,5,3,1,2,4,4,1,1,3,1,1,3,1,1,5,1,5,4,5,4,5,1,3,2,4,3,5,3,5,4,3,1,4,3,1,1,1,4,5,1,1,1,2,1,2,1,1,4,1,4,1,1,3,3,2,2,4,2,1,1,5,3,1,3,1,1,4,3,3,3,1,5,2,3,1,3,1,5,2,2,1,2,1,1,1,3,4,1,1,1,5,4,1,1,1,4,4,2,1,5,4,3,1,2,5,1,1,1,1,2,1,5,5,1,1,1,1,3,1,4,1,3,1,5,1,1,1,5,5,1,4,5,4,5,4,3,3,1,3,1,1,5,5,5,5,1,2,5,4,1,1,1,2,2,1,3,1,1,2,4,2,2,2,1,1,2,2,1,5,2,1,1,2,1,3,1,3,2,2,4,3,1,2,4,5,2,1,4,5,4,2,1,1,1,5,4,1,1,4,1,4,3,1,2,5,2,4,1,1,5,1,5,4,1,1,4,1,1,5,5,1,5,4,2,5,2,5,4,1,1,4,1,2,4,1,2,2,2,1,1,1,5,5,1,2,5,1,3,4,1,1,1,1,5,3,4,1,1,2,1,1,3,5,5,2,3,5,1,1,1,5,4,3,4,2,2,1,3";

    public static void main(String[] args) {

        List<Integer> timers = Arrays.stream(SAMPLE_INPUT.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        part1(timers);

    }

    private static void part1(List<Integer> timers) {
        for (int day = 1; day <= 80; day++)
        {
            int nbOfLanternFishToAdd = 0;
            for (int i = 0; i < timers.size(); i++){
                if(timers.get(i).equals(0)){
                    timers.set(i, 6);
                    nbOfLanternFishToAdd++;
                }
                else {
                    timers.set(i, timers.get(i) - 1);
                }
            }
            for(Object o : new Object[nbOfLanternFishToAdd]){
                timers.add(8);
            }
        }

        System.out.println("The number of lanternfich after 80 days is " + timers.size());
    }

}
