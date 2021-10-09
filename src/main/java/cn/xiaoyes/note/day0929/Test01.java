package cn.xiaoyes.note.day0929;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj"));
        oos.writeObject("123");
        oos.close();*/
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj"));
        String s = (String) ois.readObject();
        System.out.println(s);
    }
}
