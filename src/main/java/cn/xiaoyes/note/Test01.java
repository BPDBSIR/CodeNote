package cn.xiaoyes.note;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {

        int num = 1;
        switch (num) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hahaha");
                break;
        }
        /**
         * for
         * 增强for
         * while
         * do while
         */
//        for (int i = 0; i < 5; i++) {
//            System.out.println("asd");
//        }

        int[] arr = {1, 2, 4234};
        int[] ars = new int[]{123, 123};
        arr[1] = 100;
        System.out.println(Arrays.toString(arr));

        /**
         * 增强for循环
         */
        for (int ar : ars) {
            System.out.println(ar);
        }
        String s = "flow";
        System.out.println(s.indexOf("flower"));
        System.out.println(1 / 2 + 1);

        int ss = 3424;
        while (ss > 0){
            System.out.println(ss % 10);
            ss /= 10;
        }
    }
}
