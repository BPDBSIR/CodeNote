package cn.xiaoyes.note.day0906;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 定义一个泛型为String类型的List集合，统计该集合中每个字符 （注意，不是字符串）出现的次数。
 * 例如：集合中有”abc”、”bcd”两个元素， 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 */
public class Simple04 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("abc");
        data.add("bcd");
        Map<Character, Integer> map = new HashMap<>();
        for (String s : data) {
            char[] cs = s.toCharArray();
            for (char c : cs) {
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    map.put(c, map.get(c) + 1);
                }
            }
        }
        System.out.println(map);
    }
}
