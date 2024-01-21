package kyu8;

import java.util.Arrays;

public class ReversedStrings {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
