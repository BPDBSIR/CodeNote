package cn.xiaoyes.note.day0922;

public class Test02 {
    public static void main(String[] args) {

        System.out.println(d(3));
    }

    public static int d(int n){
        if (n == 1){
            return 1;
        }else {
            return n + d(n -1);
        }
    }
}
