package cn.xiaoyes.note.day0908;

/**
 * 获取用户输入的一段字符串，例如：aaaavvasdwqaszaaqwecxzz.请编写程序获取其中无重复的字符，重新组成一个新的字符串
 * 即:avsdwqzecx,请不要改变字符串的输入顺序(结果不能出现逗号，中括号等符号)
 */
public class Simple04 {
    public static void main(String[] args) {
        String str = "aaaavvasdwqaszaaqwecxzz";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (sb.toString().indexOf(c) == -1){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
