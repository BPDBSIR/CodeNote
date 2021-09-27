package cn.xiaoyes.note.day0927;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 单字符读取
 */
public class Test {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("");
        FileReader fr = new FileReader("test.txt");
//        FileInputStream fis = new FileInputStream("test.txt");
        /* StringBuilder(线程 不安全) StringBuffer(线程安全) */
//        String s = "";
        String sb = "";
        int n = 0;
        while ((n = fr.read()) != -1){
            System.out.println((char) n);
//            sb.append((char)n);
            sb = sb + (char)n;
        }
        System.out.println(sb);
    }
}
