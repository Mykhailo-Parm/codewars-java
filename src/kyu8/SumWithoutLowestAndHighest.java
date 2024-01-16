package kyu8;

import java.util.Arrays;

public class SumWithoutLowestAndHighest {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
        int min = Arrays.stream(numbers).min().orElse(0);
        int max = Arrays.stream(numbers).max().orElse(0);

        int minId = -1;
        int maxId = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) minId = i;
            else if (numbers[i] == max) maxId = i;
        }

        int[] res = new int[numbers.length - 2];
        int curId = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i != minId && i != maxId) res[curId++] = numbers[i];
        }

        return Arrays.stream(res).sum();
    }
}
