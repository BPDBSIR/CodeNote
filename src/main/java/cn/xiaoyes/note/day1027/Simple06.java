package cn.xiaoyes.note.day1027;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 六、从键盘接收数字n，输出1~n之间所有后一位比前一位大1的数  比如：12,123,234,78,789等
 */
public class Simple06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入: ");
        int k = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            int m = i;
            String temp = String.valueOf(i);
            while (m++ < 9) {
                if (Integer.parseInt(temp + m) > k) break;
                temp += m;
                list.add(Integer.valueOf(temp));
            }
        }
        System.out.println(list);

    }
}
