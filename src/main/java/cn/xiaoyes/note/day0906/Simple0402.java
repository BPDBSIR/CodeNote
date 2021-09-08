package cn.xiaoyes.note.day0906;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 定义一个泛型为String类型的List集合，统计该集合中每个字符 （注意，不是字符串）出现的次数。
 * 例如：集合中有”abc”、”bcd”两个元素， 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 */
public class Simple0402 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
//        list.add("bbhaq");
        List<Node> data = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        list.forEach(sb::append);
        char[] array = sb.toString().toCharArray();
        for (char letter : array) {
            int len = 0;
            for (char c : array) {
                if (letter == c) {
                    len++;
                }
            }
            Node node = new Node(letter, len);
            int of = data.indexOf(node);
            if (of != -1) {
                data.get(of).setLen(len);
            } else {
                data.add(new Node(letter, len));
            }
        }
        System.out.println(data);
    }

    static class Node {
        private char letter;
        private int len;

        public Node() {
        }

        public Node(char letter, int len) {
            this.letter = letter;
            this.len = len;
        }

        public char getLetter() {
            return letter;
        }

        public void setLetter(char letter) {
            this.letter = letter;
        }

        public int getLen() {
            return len;
        }

        public void setLen(int len) {
            this.len = len;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return letter == node.letter && len == node.len;
        }

        @Override
        public int hashCode() {
            return Objects.hash(letter, len);
        }

        @Override
        public String toString() {
            return getLetter() + " = " + getLen();
        }
    }
}

