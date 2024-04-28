package com.brokenhead.algorithms;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        int commonPrefixEndsAt = 0;
        while (true) {
            for (int i = 0; i < (strs.length - 1); i++) {
                if (strs[i].isEmpty()) {
                    return strs[i];
                }

                // check if prefix.length == string.length. Means - end search
                if (strs[i].length() == commonPrefixEndsAt ||
                        (strs[i + 1].length() == commonPrefixEndsAt)) {
                    return strs[i].substring(0, commonPrefixEndsAt);
                }

                if (strs[i].charAt(commonPrefixEndsAt) != strs[i + 1].charAt(commonPrefixEndsAt)) {
                    return strs[i].substring(0, commonPrefixEndsAt);
                }
            }
            commonPrefixEndsAt++;
        }
    }
}
