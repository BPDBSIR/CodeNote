package cn.xiaoyes.note.day1027;

/**
 * 二、输出1~2017之间的闰年
 */
public class Simple02 {
    public static void main(String[] args) {
        int len = 0;
        for (int i = 1; i <= 2017; i++) {
            if ((i % 4 ==0 &&  i % 100 != 0) || i % 400 ==0){
                System.out.println(i);
                len++;
            }
        }
        System.out.println("总数量: " + len);
    }
}
