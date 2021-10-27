package cn.xiaoyes.note.day1027;

/**
 * 一、定义数组 int [] arr = {7,8,9,12,5}; 求数组里最大值以及最小值
 */
public class Simple01 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 12, 5};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
