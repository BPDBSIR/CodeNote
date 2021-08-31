package cn.xiaoyes.note.day0830;

import java.util.Arrays;

/**
 * 2、已知数组中的元素如下：{1, 42, 33, 4, 5, 16, 47, 38, 19, 0}，求数组中第二大的元素
 */
public class Simple02 {
    public static void main(String[] args) {
        int[] data = {1, 42, 33, 4, 5, 16, 47, 38, 19, 0};
        Arrays.sort(data);
        System.out.println(data[1]);
    }
}
