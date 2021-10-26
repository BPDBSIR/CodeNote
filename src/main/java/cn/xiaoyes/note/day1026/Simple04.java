package cn.xiaoyes.note.day1026;

import java.util.Arrays;

public class Simple04 {
    public static void main(String[] args) {
        int[] arr = {6, 9, 12, 17, 91, 78, 77, 64, 40};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int x = 0; x < arr.length - 1 - i; x++) {
                if (arr[x] < arr[x + 1]){
                    int tem = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
