package kyu8;

import java.util.stream.IntStream;

public class CountBy {
    public static int[] countBy(int x, int n){
//        int[] arr = new int[n];
//        int j = 0;
//        for (int i = 0; i < n; i++) {
//            arr[i] = j+x;
//            j += x;
//        }
//
//        return arr;

        return IntStream.iterate(x, it -> it + x).limit(n).toArray();
    }
}
