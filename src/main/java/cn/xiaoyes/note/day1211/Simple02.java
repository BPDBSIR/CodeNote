package cn.xiaoyes.note.day1211;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 输入10-99之间之间的一个十进制整数 输出对应的十六进制数
 */
public class Simple02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入10-99之间的十进制整数: ");
        int num = sc.nextInt();
        if (num >= 10 && num <= 99){
            System.out.println(String.format("%08X",num));
        }else {
            System.out.println("输入不符合规范");
        }
    }
}
