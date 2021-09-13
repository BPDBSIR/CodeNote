package cn.xiaoyes.note.day0913;

import java.util.HashMap;
import java.util.Map;

/**
 * 分析以下需求，并用代码实现：
 * (1)统计每个单词出现的次数
 * (2)有如下字符串"If you want to change your fate I think you must come to the ujiuye to learn java"(用空格间隔)
 * (3)打印格式：
 * to=3
 * think=1
 * you=2
 */
public class Simple03 {
    public static void main(String[] args) {
        String str = "If you want to change your fate I think you must come to the ujiuye to learn java";
        Map<String, Integer> arrMap = new HashMap<>();
        for (String s : str.split(" ")) {
            // 是否包含key
            if (!arrMap.containsKey(s)) {
                arrMap.put(s, 1);
            } else {
                arrMap.put(s, arrMap.get(s) + 1);
            }
        }
        System.out.println(arrMap);
    }
}
