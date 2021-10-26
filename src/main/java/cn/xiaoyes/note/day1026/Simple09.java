package cn.xiaoyes.note.day1026;

public class Simple09 {
    public static void main(String[] args) {
        int num=2020;
        int sum=0;
        for (int i = 1; i <= num; i++) {
            if (i%10==2||i/10%10==2||i/100%10==2||i/1000==2) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
