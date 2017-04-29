package com.bob.training.leetcode;

public class Easy_ReverseInteger_7 {
    public int reverse(int x) {
        long y = x;
        long z = 0;
        while (y > 0) {
            z = z * 10 + y % 10;
            y /= 10;
        }
        if (z > Integer.MAX_VALUE || z < Integer.MIN_VALUE)
            return 0;
        return (int) z;
    }

    public static void main(String[] args) {

    }
}
