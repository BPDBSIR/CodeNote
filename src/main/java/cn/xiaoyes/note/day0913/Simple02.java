package cn.xiaoyes.note.day0913;

/**
 * 判断句子是否为全字母句
 */
public class Simple02 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        System.out.println(isFullLetter(sentence));
        System.out.println();
        System.out.println((int) 't');
        System.out.println((int) 'a');
        System.out.println((int) 't' - (int) 'a');
        System.out.println(check(sentence));
    }

    public static boolean isFullLetter(String data) {
        // 二十六的字母是否存在数组
        boolean[] arr = new boolean[26];
        for (int i = 0; i < data.length(); i++) {
            // 字母 - ‘a’ 就能的到该字母在字母表中第多少位
            arr[data.charAt(i) - 'a'] = true;
        }
        for (boolean b : arr) {
            if (!b){
                return false;
            }
        }
        return true;
    }
    public static boolean check(String sentence){
        boolean f = false;
        for (int i = 'a'; i <='z' ; i++) {
            if (sentence.indexOf(i)>=0){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
