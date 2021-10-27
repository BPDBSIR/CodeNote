package cn.xiaoyes.note.day1027;

import java.util.*;

/**
 * 五、定义数组 Int[] arr = {1,3,5,6,5,6,7,5}; 求数组中出现的次数最多的是哪个
 */
public class Simple05 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 5, 6, 7, 5};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.get(i) == null)
                map.put(i,1);
            else
                map.put(i,map.get(i) + 1);
        }
        Set<Integer> keys = map.keySet();
        Integer max = 0;
        for (Integer key : keys) {
            if (max == 0){
                max = key;
            }
            if (map.get(max) < map.get(key)){
                max = key;
            }
        }
        map.forEach((k,v) -> System.out.println("数字 => " + k + " 次数 => " + v));

        System.out.println("出现次数最多的数是 => " + max);
    }
}
