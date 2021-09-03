package cn.xiaoyes.note.day0903;

/**
 * 编写程序将“jdk”全部变成大写，并输出到屏幕，截取字符串“JK”并输出到屏幕
 */
public class Simple02 {
    public static void main(String[] args) {
        String jdk = "jdk";
        String upper = jdk.toUpperCase();
        String jk = upper.replace("D", "");
        System.out.println(jk);
    }
}
