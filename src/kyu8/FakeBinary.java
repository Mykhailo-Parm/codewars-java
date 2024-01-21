package kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return Arrays
                .stream(numberString.split(""))
                .map(Integer::parseInt)
                .map(el -> (el < 5) ? "0" : "1")
                .collect(Collectors.joining());
    }

}
