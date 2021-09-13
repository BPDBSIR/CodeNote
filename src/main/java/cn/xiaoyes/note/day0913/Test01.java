package cn.xiaoyes.note.day0913;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Goods goods1 = new Goods(1, "西瓜", 10.9);
        Goods goods2 = new Goods(1, "苹果", 10.8);
        Goods goods3 = new Goods(1, "橘子", 9.9);
        Goods goods4 = new Goods(1, "草莓", 12.9);
        Goods goods5 = new Goods(1, "菠萝", 8.6);
        Goods goods6 = new Goods(1, "香蕉", 6.0);

        List<Goods> array1 = new ArrayList<>();
        array1.add(goods1);
        array1.add(goods3);
        array1.add(goods4);

        List<Goods> array2 = new ArrayList<>();
        array2.add(goods2);
        array2.add(goods5);
        array2.add(goods6);

//        Map<String,Object> map = new HashMap<>();

        Map<String, List<Goods>> listMap = new HashMap<>();
        listMap.put("张三", array1);
        listMap.put("李四", array2);

        Set<Map.Entry<String, List<Goods>>> entrySet = listMap.entrySet();

        Iterator<Map.Entry<String, List<Goods>>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        listMap.forEach((key, value) -> {
            System.out.println(key + value);
        });
    }
}
