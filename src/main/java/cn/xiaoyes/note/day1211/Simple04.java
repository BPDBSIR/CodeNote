package cn.xiaoyes.note.day1211;

/**
 * 一个球从100m高度自由落地，每次落地后反跳回原高度的一半，在落下，在反弹，求他在第10次落地时，共经历多少米？
 */
public class Simple04 {
    public static void main(String[] args) {
        int m = 0;
        int cur = 100;
        for (int i = 0; i < 10; i++) {
            m += cur;
            if (i == 9){
                break;
            }
            m += cur /= 2;
        }
        System.out.println(m);
    }
}
