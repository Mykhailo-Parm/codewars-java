package kyu8;

import java.util.Arrays;

public class SquareSum {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int num : n) {
            sum += num * num;
        }
        return sum;

//        return Arrays.stream(n).map(x -> x * x).sum();
    }
}
