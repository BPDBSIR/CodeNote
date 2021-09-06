package cn.xiaoyes.note.day0906;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("all")
public class Test01 {
    public static void main(String[] args) {
        People p1 = new People("小花", 20);
        People p2 = new People("小黑", 21);
        People p3 = new People("小白", 19);

        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();
        list1.add(p1);
        list1.add(p2);
        list1.add(p3);


        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }


        for (Object o : list1) {
            System.out.println(o);
        }

        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        list1.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });
    }
}
