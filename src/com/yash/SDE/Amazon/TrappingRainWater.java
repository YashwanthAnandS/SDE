package com.yash.SDE.Amazon;

import java.util.Scanner;

/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it is able to trap after raining.

Example:
Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(trap(arr));
    }

    public static int trap(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int left = 0;
        int right = array.length - 1;
        int barL = 0, barR = 0;
        int res = 0;

        while (left < right) {
            barL = Math.max(barL, array[left]);
            barR = Math.max(barR, array[right]);
            if (barL < barR) {
                res += (barL - array[left++]);
            } else {
                res += (barR - array[right--]);
            }
        }

        return res;
    }
}
