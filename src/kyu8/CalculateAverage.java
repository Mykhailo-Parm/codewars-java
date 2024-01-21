package kyu8;

import java.util.Arrays;

public class CalculateAverage {
    public static double findAverage(int[] array) {
        return (double) Arrays.stream(array).reduce(0, Integer::sum) / array.length;

//        return Arrays.stream(array).average().orElse(0);
    }
}
