package cn.xiaoyes.note.day0831;

public class Test01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("23");
        char c = sb.charAt(0);
        System.out.println(Integer.parseUnsignedInt(sb.toString(),10));
        System.currentTimeMillis();
    }
}
