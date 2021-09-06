package cn.xiaoyes.note.day0906;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 、已知数组存放一批QQ号码，QQ号码最长为11位，
 * 最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
 * 将该数组里面的所有qq号都存放在LinkList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
 */
public class Simple03 {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        List<String> data = new LinkedList<>();
        for (String str : strs) {
            if (!data.contains(str)) {
                data.add(str);
            }
        }
        Iterator<String> iterator = data.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
        for (String d : data) {
            System.out.print(d + ", ");
        }
    }
}
