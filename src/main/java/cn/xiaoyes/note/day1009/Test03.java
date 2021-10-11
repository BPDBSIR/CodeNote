package cn.xiaoyes.note.day1009;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test03 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name", "Andrew");
        map.put("age", "20");
        map.put("gender", "男");

        map.forEach((s, s2) -> System.out.println(s + " -- " + s2));

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " -- " + map.get(key));
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + " -- " + next.getValue());
        }
    }
}
