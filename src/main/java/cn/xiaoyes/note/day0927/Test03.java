package cn.xiaoyes.note.day0927;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * 按照char数组进行批量读取
 */
public class Test03 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("test.txt");
        StringBuilder sb = new StringBuilder("");
        char[] cs = new char[2];
        int n = 0;
        while ((n = fr.read(cs)) != -1){
//            System.out.println(Arrays.toString(cs));
//            sb.append(cs);
            sb.append(cs,0,n);
        }
        System.out.println(sb);
    }
}
