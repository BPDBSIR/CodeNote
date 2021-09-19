package cn.xiaoyes.note.day0917;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
 */
public class Simple01 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(123);
        arr.add(13);
        arr.add(25);
        arr.add(123);
        arr.add(13);
        System.out.println(listTest(arr, 13));
    }

    public static int listTest(List<Integer> al, Integer s) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).equals(s))
                return i;
        }
        return -1;
    }
}
