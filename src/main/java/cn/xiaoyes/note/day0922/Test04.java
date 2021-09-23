package cn.xiaoyes.note.day0922;

import java.io.File;

public class Test04 {
    public static void main(String[] args) {
        showFiles("D:\\Andu");
    }

    public static void showFiles(String path) {
        File f = new File(path);
        // 判断是否存在
        if (f.exists()) {
            // 判断是否为文件夹
            if (f.isDirectory()) {
                System.out.println(f.getAbsolutePath());
                File[] files = f.listFiles();
                if (files == null || files.length == 0) {
                    return;
                } else {
                    for (File file : files) {
                        showFiles(file.getAbsolutePath());
                    }
                }
            }
        }else if (f.isFile()){
            System.out.println(f.getAbsolutePath());
        }
    }
}
