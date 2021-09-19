package cn.xiaoyes.note.day0917;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        String data = "abcajsdhlad";
        char[] chars = removeRepeat(data);
        System.out.println(Arrays.toString(chars));
    }

    /**
     * 字符串去重
     * @param data 数据
     * @return 字符数组
     */
    public static char[] removeRepeat(String data) {
        StringBuilder sb = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (sb.toString().indexOf(c) == -1){
                sb.append(c);
            }
        }
        return sb.toString().toCharArray();
    }


    public static char[] removeRepeat2(String data){
        char[] array = data.toCharArray();

        for (int i = 0; i < array.length; i++) {

        }
        return new char[2];
    }

    public static String[] deleteStr(String data){
        String[] arr = data.split("");
        Set<String> set = new HashSet<>();
        for (String s : arr) {
            set.add(s);
        }
        String[] arrs = new String[set.size()];
        arrs = set.toArray(arrs);
        return arrs;
    }
}
