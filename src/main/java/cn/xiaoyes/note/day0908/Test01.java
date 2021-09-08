package cn.xiaoyes.note.day0908;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        People p1 = new People("小花",18);
        People p2 = new People("小黑",19);
        People p3 = new People("小白",20);
        People p4 = new People("小黑",19);
        Set<People> set  = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for (People people : set) {
            System.out.println(people);
        }

        Iterator<People> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    static class People{
        private String name;
        private int age;

        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
