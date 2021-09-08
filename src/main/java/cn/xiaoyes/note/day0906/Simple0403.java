package cn.xiaoyes.note.day0906;

import java.util.ArrayList;
import java.util.List;

public class Simple0403 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abccd");
        list.add("bbacd");

        List<Character> characters = new ArrayList<>();
        for (String s : list) {
            for (int i = 0; i < s.length(); i++) {
                characters.add(s.charAt(i));
            }
        }

        System.out.println(characters);
        /* 循环遍历字符集合 */
        for (int i = 0; i < characters.size(); i++) {
            /* 数量默认为0 */
            int count = 1;
            /* 从当前位置循环遍历字符集合 */
            for (int x = i + 1; x < characters.size(); x++) {
                /* 判断是否相等 如果相等就移除并且++*/
                if (characters.get(i) == characters.get(x)){
                    characters.remove(x);
                    count++;
                    x--;
                }
            }
            System.out.println(characters.get(i) + " = " + count);
        }


    }
}
