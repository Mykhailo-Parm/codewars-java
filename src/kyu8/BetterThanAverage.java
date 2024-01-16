package kyu8;

import java.util.Arrays;

public class BetterThanAverage {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        return Arrays.stream(classPoints).average().orElse(0) <= yourPoints;
    }
}
