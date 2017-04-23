package com.bob.training.leetcode;

public class Medium_ZigZagConvension_6 {
    
    public String convert(String s, int numRows) {
        int len = s.length();
        StringBuffer sb[] = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuffer();
        }

        int index = 0;
        while (index < len) {
            for (int i = 0; i < numRows && index < len; i++) {
                sb[i].append(s.charAt(index++));
            }
            for (int i = numRows - 2; i >= 1 && index < len; i--) {
                sb[i].append(s.charAt(index++));
            }
        }
        for (int i = 1; i < numRows; i++) {
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }

    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMN";
        Medium_ZigZagConvension_6 solution = new Medium_ZigZagConvension_6();
        System.out.println(solution.convert(s, 1));
    }
}
