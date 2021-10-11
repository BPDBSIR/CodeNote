package cn.xiaoyes.note.day1009;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test01 {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("张三");
        list.add("1");
        list.add(202.23);
        for (Object o : list) {
            System.out.println(o);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.forEach(System.out::println);
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        List<Integer> arr = new ArrayList<>();
        arr.add(200);
        arr.add(100);
        arr.add(160);
        arr.add(120);
        Object[] objects = arr.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 150;
            }
        }).toArray();
        System.out.println(Arrays.toString(objects));
        Object[] objects1 = arr.stream().map(new Function<Integer, Object>() {
            @Override
            public Object apply(Integer integer) {
                return integer > 150;
            }
        }).toArray();
        System.out.println(Arrays.toString(objects1));
    }
}
