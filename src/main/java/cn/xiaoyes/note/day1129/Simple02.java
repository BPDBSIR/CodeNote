package cn.xiaoyes.note.day1129;

import java.util.HashMap;

/**
 *
 */
public class Simple02 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 3}, {4, 2}};
        System.out.println(demo(arr));
    }

    public static int demo(int[][] edges) {
        HashMap<Integer, Integer> data = new HashMap<>();
        for (int[] e : edges) {
            for (int i : e) {
                if (data.containsKey(i)) {
                    return i;
                } else {
                    data.put(i, 1);
                }
            }
        }
        return -1;
    }
}
