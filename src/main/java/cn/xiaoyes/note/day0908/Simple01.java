package cn.xiaoyes.note.day0908;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 产生10个1~20之间的随机数，要求随机数不能重复
 */
public class Simple01 {
    public static void main(String[] args) {
        Set<Integer> ints = new HashSet<>();
        Random r = new Random();
        while (ints.size() < 10){
            int n = r.nextInt(19) + 1;
            ints.add(n);
        }
        System.out.println(ints);
    }
}
