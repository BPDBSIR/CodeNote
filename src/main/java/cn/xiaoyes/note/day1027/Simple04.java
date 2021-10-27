package cn.xiaoyes.note.day1027;

/**
 * 四、输出1~10000之间以8开头，以7结尾且能被3整除的数
 */
public class Simple04 {
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            String s = String.valueOf(i);
            if (Integer.parseUnsignedInt(s.substring(0,1),10) == 8 && i % 10 == 7 && i % 3 ==0){
                System.out.println(i);
            }
        }
    }
}
