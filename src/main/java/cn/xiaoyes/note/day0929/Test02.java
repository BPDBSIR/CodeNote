package cn.xiaoyes.note.day0929;

import java.io.*;

public class Test02 {
    public static void main(String[] args) {

    }

    public static void copy(String source,String target){
        try {
            FileReader reader = new FileReader(source);
            BufferedReader br = new BufferedReader(reader);
            FileWriter writer = new FileWriter(target);
            BufferedWriter bw = new BufferedWriter(writer);
            String line = null;
            while ((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            bw.close();
            writer.close();
            br.close();
            reader.close();
        }catch (IOException e){
            System.err.println("文件操作错误");
        }
    }
}
