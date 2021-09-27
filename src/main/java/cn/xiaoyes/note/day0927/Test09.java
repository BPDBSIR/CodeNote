package cn.xiaoyes.note.day0927;

import java.io.*;

/**
 * 文件字节流
 */
public class Test09 {
    public static void main(String[] args) {
        String content = inputRead("D:\\Test\\1.txt");
        System.out.println(content);
    }
    public static String inputRead(String file){
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] bs = new byte[1024];
            int len;
            while ((len = fis.read(bs)) != -1){
                sb.append(new String(bs,0,len));
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void outputWriter(String file,String content){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(content.getBytes());
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void ss(String source,String target){
        FileInputStream fr = null;
        FileOutputStream fw = null;
        try {
            fr = new FileInputStream(source);
            fw = new FileOutputStream(target);
            byte[] bs = new byte[1024];
            int len;
            while ((len = fr.read(bs)) != -1) {
                fw.write(bs, 0, len);
                fw.flush();
            }
            fr.close();
            fw.close();
        }catch (IOException e){
            System.err.println("文件复制错误");
        }finally {
        }
    }
}
