package cn.xiaoyes.note.day0903;

import java.util.Scanner;

/**
 * 给出一个随机字符串，判断有多少字母？多少数字？
 */
public class Simple01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串: ");
        String str = sc.next();
        char[] data = str.toCharArray();
        int a = 0;
        int b = 0;
        for (char d : data) {
            if (((int)(d) >= ((int) 'A') && (int)(d) <= (int) 'Z') || ((int)(d) >= ((int) 'a') && (int)(d) <= (int) 'z')){
                a++;
            }else if ((int)(d) >= ((int) '0') && (int)(d) <= (int) '9'){
                b++;
            }
        }
        System.out.println("字母的数量是: " + a);
        System.out.println("数字的数量是: " + b);
    }
}
