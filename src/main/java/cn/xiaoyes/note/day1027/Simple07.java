package cn.xiaoyes.note.day1027;

import java.util.ArrayList;
import java.util.List;

/**
 * 七、已知学生对象，属性包括姓名，年龄，成绩属性，根据属性创建一个javabean
 * 创建四个学生对象：
 * 张三,18,85
 * 李四,18,89
 * 王五,16,89
 * 张三,14,70
 * 将这四个对象添加到ArrayList中。
 */
public class Simple07 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18,85);
        Student stu2 = new Student("李四",18,89);
        Student stu3 = new Student("王五",16,89);
        Student stu4 = new Student("张三",14,70);
        List<Student> arr = new ArrayList<>();
        arr.add(stu1);
        arr.add(stu2);
        arr.add(stu3);
        arr.add(stu4);
        for (Student student : arr) {
            System.out.println(student);
        }
    }

}
