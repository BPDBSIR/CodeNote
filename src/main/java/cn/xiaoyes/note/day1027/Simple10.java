package cn.xiaoyes.note.day1027;

/**
 * 煤球
 */
public class Simple10 {
    public static void main(String[] args) {
        int ans = 0;
        for (int i = 1; i <= 100; i++){
            System.out.println("第" + i + "层 => " + "数量 => " + (i + 1) * i / 2);
            ans += (i + 1) * i / 2;
        }
        System.out.println(ans);
    }
}
