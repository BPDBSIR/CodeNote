package cn.xiaoyes.note.day0917;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test03 {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.setProperty("name","Andu");
        properties.setProperty("age","20");
        properties.setProperty("age","20");
        System.out.println(properties.getProperty("name"));
        System.out.println(properties);
//        FileInputStream fs = new FileInputStream("src/main/java/cn/xiaoyes/note/day0917/jdbc.properties");
        InputStream is = Test03.class.getClassLoader().getResourceAsStream("jdbc.properties");
        properties.load(is);
        System.out.println(properties);
    }
}
