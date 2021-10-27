package cn.xiaoyes.note.day1027;

/**
 *
 */
public class Simple09 {
    public static void main(String[] args) {
        int n = 777;
        String s = "vxvxvxvxvxvxvvx";
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == 'v'){
                n *= 2;
            }else if (c == 'x'){
                n -= 555;
            }
        }
        System.out.println("剩余游戏币: " + n);
    }
}
