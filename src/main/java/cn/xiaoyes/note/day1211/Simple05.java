package cn.xiaoyes.note.day1211;

/**
 * 3025这个数具有一种独特的性质: 将它平分为二段，即30和25，使之相加后求平方，即(30 + 25)2，恰好等于3025本身。
 * 请输出具有这样性质转换的全部四位数。
 */
public class Simple05 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            String s1 = ("" + i).substring(0, 2);
            String s2 = ("" + i).substring(2);
            int num = Integer.parseInt(s1) + Integer.parseInt(s2);
            num = num * num;
            if (num == i) {
                System.out.println(i);
            }
        }
    }
}
