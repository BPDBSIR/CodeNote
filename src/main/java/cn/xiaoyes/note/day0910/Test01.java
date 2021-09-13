package cn.xiaoyes.note.day0910;

import java.util.*;

public class Test01 {

    public static void main(String[] args) {


        Map<String, List<String>> stringListMap = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        stringListMap.put("list1", list1);
        stringListMap.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
        HashMap<Object,Object> map = new HashMap<>();
        map.put("001","张三");
        map.put("002","李四");
        Object v1 = map.get("001");
        System.out.println(v1);

        Set<Object> keys = map.keySet();
        for (Object key : keys) {
            System.out.println(map.get(key));
        }

        Iterator<Object> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }


        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        Iterator<Map.Entry<Object, Object>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()){
            System.out.println(entryIterator.next());
        }
    }
}
