package cn.xiaoyes.note.day0830;

/**
 * 已知函数 signFunc(x) 将会根据 x 的正负返回特定值：
 * <p>
 * 如果 x 是正数，返回 1 。
 * 如果 x 是负数，返回 -1 。
 * 如果 x 是等于 0 ，返回 0 。
 * 给你一个整数数组 nums 。令 product 为数组 nums 中所有元素值的乘积
 */
public class Simple04 {
    public static void main(String[] args) {
//        int[] data = {-1, -2, -3, -4, 3, 2, 1};
//        int[] data = {1, 5, 0, 2, -3};
        int[] data = {-1, 1, -1, 1, -1};
        int i = singFunc(data);
        System.out.println(i);
    }

    public static int singFunc(int[] arr) {
        int c = 1;
        for (int i : arr) {
            c *= i;
        }
        int result = 0;
        if (c > 1) {
            result = 1;
        } else if (c < 0) {
            result = -1;
        }
        return result;
    }
}
