package cn.xiaoyes.note.day1027;

/**
 * 三、打印九九乘法表，但不输出3*3=9
 */
public class Simple03 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int x = 1; x <= i; x++) {
                if (i == 3 && x == 3){
                    continue;
                }
                System.out.print(x + "*" + i + "=" + i * x + " ");
            }
            System.out.println();
        }
    }
}
