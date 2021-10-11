package cn.xiaoyes.note.day1009;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Test02 {
    public static void main(String[] args) {
        HashSet<String> sets = new HashSet<>();
        sets.add("123123");
        sets.add("123");
        sets.add("张三");
        sets.add("123");
        for (String set : sets) {
            System.out.println(set);
        }
        sets.forEach(System.out::println);

    }
}
