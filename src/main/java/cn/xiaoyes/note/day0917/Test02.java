package cn.xiaoyes.note.day0917;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        String data = "I am KangKang Welcome to China";
        System.out.println(Arrays.toString(reverseWord(data)));
        reverseWord2(data);
    }

    public static String[] reverseWord(String data) {
        String[] arr = data.split(" ");
        String[] result = new String[arr.length];
        for (int i = arr.length - 1,j = 0; i >= 0; i--,j++) {
            result[j] = arr[i];
        }
        return result;
    }

    public static String[] reverseWord2(String data){
        String[] arr = data.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
        return null;
    }
}
