package cn.xiaoyes.note.day0903;

/**
 * String s =”113@ ere qqq you”,请输出 113 ere qqq you
 */
public class Simple04 {
    public static void main(String[] args) {
        String s = "113@ ere qqq you";
        System.out.println(s.replace("@", ""));
    }
}
