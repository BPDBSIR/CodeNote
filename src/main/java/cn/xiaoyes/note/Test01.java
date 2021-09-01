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
        while (ss > 0) {
            System.out.println(ss % 10);
            ss /= 10;
        }
    }


}

//
//class OverrideDemo{
//
//
//    public String run(String text){
//        return "";
//    }
//    public int run(String text){
//        return 0;
//    }
//    public String run(){
//        return "";
//    }
//    public String run(int text){
//        return "";
//    }
//}
class Person {
    public void printValue(int i, int j) {/*…*/ }

    public void printValue(int i) {/*...*/ }
}

class Teacher123 extends Person {
    public void printValue() {/*...*/ }

    public void printValue(int i) {/*...*/}

    public static void main(String args[]) {
        Person t = new Teacher123();
        t.printValue(10);
    }
}