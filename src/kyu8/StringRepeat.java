package kyu8;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            result.append(string);
        }

        return result.toString();

//        return string.repeat(repeat);
    }
}
