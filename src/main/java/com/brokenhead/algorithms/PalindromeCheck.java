package com.brokenhead.algorithms;

public class PalindromeCheck {

    //        int upperStart = 65, upperEnd = 90;
    //        int lowerStart = 97, lowerEnd = 122;
    //        int numberStart = 48, numberEnd = 57;

    public static boolean isPalindrome(String s) {
        String prepared = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        if (prepared.isEmpty()) {
            return true;
        }
        int fromTail = prepared.length() - 1;
        for (int i = 0; i <= fromTail / 2; i++) {
            if (prepared.charAt(i) != prepared.charAt(fromTail - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeByIndexes(String s) {
        if (s.equals(" ")) {
            return true;
        }

        int startIndex = 0;
        int endIndex = s.length() - 1;

        while (startIndex < endIndex) {
            char startChar = Character.toLowerCase(s.charAt(startIndex));
            char endChar = Character.toLowerCase(s.charAt(endIndex));


            if (!Character.isLetterOrDigit(startChar)) {
                startIndex++;
                continue;
            }
            if (!Character.isLetterOrDigit(endChar)) {
                endIndex--;
                continue;
            }
            if (startChar != endChar) {
                return false;
            }
            startIndex++;
            endIndex--;
        }

        return true;
    }
}
