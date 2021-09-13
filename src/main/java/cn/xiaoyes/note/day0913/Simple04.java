package cn.xiaoyes.note.day0913;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * 已知 List<String> list = new ArrayList<String>();
 * list .add("张三丰,北京");
 * list .add("李四丰,上海");
 * list .add("王二小,北京");
 * list .add("小明,河北");
 * list .add("小毛,北京");
 * list .add("王五,北京");
 * 要求：求出每个地区有多少人，都是谁？
 */
public class Simple04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("张三丰,北京");
        list.add("李四丰,上海");
        list.add("王二小,北京");
        list.add("小明,河北");
        list.add("小毛,北京");
        list.add("王五,北京");
        Map<String, List<String>> listMap = new HashMap<>();
        list.forEach(s -> {
            String[] sr = s.split(",");
            // 判断key是否存在
            if (listMap.containsKey(sr[1])) {
                listMap.get(sr[1]).add(sr[0]);
            } else {
                List<String> nameList = new ArrayList<>();
                nameList.add(sr[0]);
                listMap.put(sr[1], nameList);
            }
        });
        listMap.forEach((s, strings) -> System.out.println(s + " => " + strings));
    }
}
