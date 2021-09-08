package cn.xiaoyes.note.day0908;

import java.util.*;

/**
 * 使用Scanner从键盘读取一行输入，去掉其中重复字符，打印出不同的那些字符
 */
public class Simple02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        Set<Character> characters = new HashSet<>();
        for (char c : next.toCharArray()) {
            characters.add(c);
        }
        System.out.println(characters);
    }
}
