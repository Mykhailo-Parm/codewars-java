package kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighAndLow {
    public static String HighAndLow(String numbers) {
        List<Integer> arr = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).toList();
        int low = arr.get(0);
        int high = arr.get(0);
        for (int el: arr) {
            low = Math.min(el, low);
            high = Math.max(el, high);
        }

        return high + " " + low;

        //var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        //    return stats.getMax() + " " + stats.getMin();
    }
}
