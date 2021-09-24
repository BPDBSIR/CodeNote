package cn.xiaoyes.note.day0924;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        System.out.println(readText("D:\\test.txt"));
    }

    public static String readText(String file){
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fr = new FileReader(file);
            char[] chars = new char[1024];
            int n = 0;
            while ((n = fr.read(chars)) != -1){
                sb.append(chars);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
