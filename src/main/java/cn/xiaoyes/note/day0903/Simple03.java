package cn.xiaoyes.note.day0903;

/**
 * 写一个方法判断一个字符串是否对称 :反转
 */
public class Simple03 {
    public static void main(String[] args) {
        String s = "abc1cba";
        if (s.equals(new StringBuilder(s).reverse().toString())){
            System.out.println("对称字符串");
        }else {
            System.out.println("不对称字符串");
        }
    }
}
