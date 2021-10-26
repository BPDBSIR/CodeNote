package cn.xiaoyes.note.day1026;

import java.io.FileWriter;
import java.io.IOException;

public class Simple05 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\1.txt");
        fw.write("talk is cheap show me code");
        fw.close();
    }
}
