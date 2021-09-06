package cn.xiaoyes.note.day0906;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 1.	1、在一个列表中存储以下元素：apple,grape,banana,pear
 * • 1.1 返回集合中的最大的和最小的元素
 * • 1.2 将集合进行排序，并将排序后的结果打印在控制台上
 */
public class Simple01 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("apple");
        data.add("grape");
        data.add("banana");
        data.add("pear");
        data.sort(String::compareTo);
        data.forEach(System.out::println);
    }
}
