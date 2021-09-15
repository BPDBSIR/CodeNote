package cn.xiaoyes.note.day0915;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class StudentManagerTest {
    public static void main(String[] args) {
        Map<String, List<Student>> map = new HashMap<>();
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("001","张三"));
        list1.add(new Student("002","李四"));
        list1.add(new Student("003","王五"));
        list1.add(new Student("004","赵六"));
        list1.add(new Student("005","洪七"));
        map.put("二班",list1);
        map.forEach(new BiConsumer<String, List<Student>>() {
            @Override
            public void accept(String s, List<Student> strings) {
                System.out.println(s + strings);
            }
        });
    }
}
