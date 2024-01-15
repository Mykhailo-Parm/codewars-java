package kyu8;

public class Digitize {
    public static int[] digitize(long n) {
//        String numberString = Long.toString(n);
//        int[]reversedArray = new int[numberString.length()];
//        for (int i = 0; i < numberString.length(); i++) {
//            reversedArray[i] = (int) (n % 10);
//            n /= 10;
//        }
//
//        return reversedArray;
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
