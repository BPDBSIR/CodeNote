package cn.xiaoyes.note.day1211;

/**
 * 个位数能为6且能被3整除的五位数共有多少
 */
public class Simple03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10000; i < 100000; i++) {
            String tmp = "" + i;
            int x = Integer.parseInt(tmp.substring(tmp.length() -1));
            if (x == 6 && x % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
