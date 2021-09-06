package cn.xiaoyes.note.day0906;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 2.	产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台
 */
public class Simple02 {
    public static void main(String[] args) {
        int len = 100;
        int[] nums = new int[100];
        int idx = 0;
        Random r = new Random();
        for (int i = 1; i <= len; i++) {
            nums[idx++] = r.nextInt(100) + 1;
        }
        List<Integer> data = new ArrayList<>();
        for (int n : nums) {
            if (n > 10) {
                data.add(n);
            }
        }
        System.out.println(Arrays.toString(nums));
        data.forEach(integer -> System.out.print(integer + ", "));
    }
}
