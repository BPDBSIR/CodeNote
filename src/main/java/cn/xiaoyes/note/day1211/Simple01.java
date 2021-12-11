package cn.xiaoyes.note.day1211;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入四个整数 按由小到大顺序输出
 */
public class Simple01 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个数字: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
