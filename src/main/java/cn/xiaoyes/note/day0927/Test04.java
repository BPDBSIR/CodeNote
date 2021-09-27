package cn.xiaoyes.note.day0927;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *批量读取
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test.txt");
        char[] cs = new char[5];
        int read = fr.read(cs);
        System.out.println(read);
    }
}
