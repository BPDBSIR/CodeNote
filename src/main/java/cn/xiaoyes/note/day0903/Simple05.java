package cn.xiaoyes.note.day0903;

/**
 * String s="name=zhangsan age=18 classNo=090728"";将上面的字符串拆分，结果如下:
 * zhangsan 18 090728
 */
public class Simple05 {
    public static void main(String[] args) {
        String s = "name=zhangsan age=18 classNo=090728";
        String[] s1 = s.split(" ");
        for (String s2 : s1) {
            String[] split = s2.split("=");
            System.out.print(split[1] + " ");
        }
    }
}
