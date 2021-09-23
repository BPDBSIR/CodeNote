package cn.xiaoyes.note.day0922;

import java.io.File;

public class Test01 {
    public static void main(String[] args) {

        File file = new File("D:\\hello.txt");

        /* 获取绝对路径 */
        System.out.println(file.getAbsolutePath());

        /* 获取名称 */
        System.out.println(file.getName());

        /* 判断是否存在 */
        System.err.println(file.exists());
    }
}
