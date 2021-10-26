package cn.xiaoyes.note.day1026;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Simple06 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\1.txt");
        StringBuilder sb = new StringBuilder();
        int n = 0;
        while ((n = fr.read()) != -1){
            sb.append((char) n);
        }
        fr.close();

        String val = sb.toString().replace('e','y');
        System.out.println(val);

        FileWriter fw = new FileWriter("D:\\1.txt");
        fw.write(val);
        fw.close();
    }
}
