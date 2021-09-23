package cn.xiaoyes.note.day0922;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) {
        System.out.println(readText("D:\\ssh.txt"));
    }

    public static String readText(String file) {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fr = new FileReader(file);
            int n = 0;
            while ((n = fr.read()) != -1){
                sb.append((char) n);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到: " + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
