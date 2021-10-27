package cn.xiaoyes.note.day1027;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 八、将上题中的list去掉名字相同的对象
 */
public class Simple08 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 18, 85);
        Student stu2 = new Student("李四", 18, 89);
        Student stu3 = new Student("王五", 16, 89);
        Student stu4 = new Student("张三", 14, 70);
        List<Student> arr = new ArrayList<>();
        arr.add(stu1);
        arr.add(stu2);
        arr.add(stu3);
        arr.add(stu4);
        /* 重写Student的equals方式使用Set根据名字去重 */
        Set<Student> sets = new HashSet<>(arr);
        for (Student s : sets) {
            System.out.println(s);
        }
    }
}
