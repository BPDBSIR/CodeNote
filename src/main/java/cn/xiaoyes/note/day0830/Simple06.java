package cn.xiaoyes.note.day0830;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class Simple06 {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        String prefix = getPublicPrefix(strings);
        System.out.println(prefix);
    }


    public static String getPublicPrefix(String[] data) {
        if (data.length == 0)
            return "";
        // 获取数组中的第一个元素
        String str = data[0];
        // 循环遍历数组
        for (int i = 1; i < data.length; i++) {
            // 使用indexOf方法判断data[i]内是否包含str 不等于0表示
            while (data[i].indexOf(str) != 0) {
                // 从0位置开始截取字符串一直到字符串的长度-1位置
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }


}
