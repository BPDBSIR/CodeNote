package cn.xiaoyes.note.day0927;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 异常机制
 */
public class Test05 {
    public static void main(String[] args) throws FileNotFoundException {
        send();
        System.out.println("asdasd");
    }

    public static void send() throws FileNotFoundException {
        FileReader fr = new FileReader("asd.txt");
    }
}
