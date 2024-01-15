package kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveChars {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}
