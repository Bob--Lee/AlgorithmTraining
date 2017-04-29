package com.bob.training.leetcode;

public class Medium_LongestPalindromicSubstring_5 {
    public int left = 0, maxlen = 0;
    public int sLen;

    public String longestPalindrome(String s) {
        sLen = s.length();
        if (sLen < 2) return s;
        for(int i = 0; i < sLen; i++) {
            checkIfPalindrome(s, i, i);
            checkIfPalindrome(s, i, i + 1);
        }
        return s.substring(left, left + maxlen);
    }

    public void checkIfPalindrome(String s, int l, int r) {
        while (l >= 0 && r < sLen && s.charAt(l) == s.charAt(r)) {
            l --;
            r ++;
        }
        l ++;
        r --;
        if (r - l + 1 > maxlen) {
            maxlen = r - l + 1;
            left = l;
        }
    }

    public static void main(String[] args) {
        Medium_LongestPalindromicSubstring_5 solution = new Medium_LongestPalindromicSubstring_5();
        System.out.println(solution.longestPalindrome("babad"));
    }
}
