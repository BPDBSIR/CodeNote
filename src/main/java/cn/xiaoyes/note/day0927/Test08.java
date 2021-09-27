package cn.xiaoyes.note.day0927;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test08 {
    public static void main(String[] args) throws IOException {
//        writeText("D:\\asd.txt", "你好世界");
        copy("D:\\Test\\1.txt", "D:\\Test\\2.txt");
    }

    public static void writeText(String file, String s) throws IOException {
        FileWriter fw = new FileWriter(file);
        fw.write(s);
        fw.flush();
        fw.close();
    }

    /**
     * 文本文件的拷贝
     * @param source 源文件
     * @param target 目标文件
     * @throws IOException 异常
     */
    public static void copy(String source, String target) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(source);
            fw = new FileWriter(target);
            char[] bs = new char[1024];
            int len;
            while ((len = fr.read(bs)) != -1) {
                fw.write(bs, 0, len);
                fw.flush();
            }
        }catch (IOException e){
            System.err.println("文件复制错误");
        }finally {
            if (fw != null)
                fw.close();
            if (fr != null)
                fr.close();
        }
    }
}
