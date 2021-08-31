package cn.xiaoyes.note.day0830;

import java.util.Arrays;

/**
 * 1、定义一个数组[5,9,12,45,18,30]，求出最大值和最小值。
 */
public class Simple01 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 12, 45, 18, 30};
        /**
         * 方法一
         */
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        /**
         * 方式二
         */
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
    }
}
