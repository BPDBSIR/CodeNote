package cn.xiaoyes.note.day1129;

import java.util.HashSet;
import java.util.Set;

public class Simple01 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(test(sentence));
    }

    public static boolean test(String sentence) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}
