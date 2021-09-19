package cn.xiaoyes.note.day0918;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {

        /**
         *
         */

        File file = new File("D:\\Test\\1asd");
        boolean mkdirs = file.mkdirs();
        if (mkdirs)
            System.out.println("创建多级目录成功");
        else
            System.out.println("创建失败");


        File file1 = new File("D:\\Test\\123.txt");
        // 创建文件
        boolean isSuccess = file1.createNewFile();


    }
}
