package cn.xiaoyes.note.day0830;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 */
public class Simple05 {
    public static void main(String[] args) {
        int reverse1 = reverse(123);
        System.out.println(reverse1);
        int reverse2 = reverse(-321);
        System.out.println(reverse2);
        int reverse3 = reverse(120);
        System.out.println(reverse3);
    }

    public static int reverse(int x) {
        int num = 0;
        if (x > 0) {
            num = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
        }
        if (x < 0) {
            String s = String.valueOf(x);
            num = Integer.parseInt("-" + new StringBuilder(s.substring(1)).reverse());
        }
        return num;
    }
}
