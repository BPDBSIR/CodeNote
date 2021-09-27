package cn.xiaoyes.note.day0927;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 转换流(解决编码问题)
 */
public class Test06 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("test.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        int n = 0;
        while ((n = isr.read()) != -1){
            System.out.print((char) n);
        }
    }
}
