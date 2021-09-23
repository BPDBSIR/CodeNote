package cn.xiaoyes.note.day0922;

/**
 * 递归计算阶乘
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println(jc(5));
        System.out.println(jc2(5));
    }

    public static int jc(int n){
        if (n != 1){
            return n * jc(n -1);
        }
        return 1;
    }

    public static int jc2(int n){
        int nu = 1;
        for (int i = n; i > 0; i--) {
            nu *= i;
        }
        return nu;
    }
}
