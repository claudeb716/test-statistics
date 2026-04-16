package com.pluralsight;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestStats {
    public static void main(String[] args) {
        int[] average = {99, 98, 98, 89, 80, 80, 75, 85, 84, 60};
        System.out.println("Average:");
        for (int averages : average){
            System.out.println(averages);
        }
        System.out.println("============================");

        int[] highScore = {99, 98, 98, 89, 80, 80, 75, 85, 84, 60};
        Arrays.sort(highScore);
        System.out.println("High Score:");
        for (int highScores : highScore){
            System.out.println(highScores);
        }
        System.out.println("============================");

        int[] lowScores = {99, 98, 98, 89, 80, 80, 75, 85, 84, 60};
        System.out.println("Average:");
        for (int lowscore : lowScores){
            System.out.println(lowscore);
        }
        System.out.println("============================");

    }
}
