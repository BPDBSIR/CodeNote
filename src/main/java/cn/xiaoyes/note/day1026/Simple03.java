package cn.xiaoyes.note.day1026;

public class Simple03 {
    public static void main(String[] args) {
        for (int i = 1; i <10; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 4 && j == 4){
                    continue;
                }
                System.out.print(j + "*" + i + "=" + i * j + "  ");
            }
            System.out.println();
        }
    }
}
