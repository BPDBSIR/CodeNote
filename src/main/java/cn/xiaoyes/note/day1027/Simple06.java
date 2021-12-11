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
            /* 临时储存i的值 */
            int m = i;
            /* i的值转换为String */
            String temp = String.valueOf(i);
            /* 循环9次 */
            while (m++ <9) {
                /* 判断temp + m 是否大于k 如果大于就跳出整个while循环 */
                if (Integer.parseInt(temp + m) > k) break;
                /* temp = temp + m */
                temp += m;
                /* 然后讲得到的结果添加到集合中 */
                list.add(Integer.valueOf(temp));
            }
        }
        /* 输出结果 */
        System.out.println(list);
    }
}
