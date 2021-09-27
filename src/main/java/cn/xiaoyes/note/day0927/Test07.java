package cn.xiaoyes.note.day0927;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        int n = -1;
        while ((n = br.read()) != -1){
            System.out.print((char) n);
        }
    }
}
