package kyu8;

import java.util.stream.IntStream;
public class GrassHopper {

    public static int summation(int n) {

        return IntStream.rangeClosed(1, n).sum();
    }
}