package cn.xiaoyes.note.day0903;

import java.util.Scanner;

/**
 * 根据输入的年份、产品类型和随机数产生固定资产编号即：固定资产编号=年份+0+产品类型+3位随机数，程序运行流程：请输入年份：请选择产品类型（1. 台式机 2. 笔记本 3. 其他）：生成3位随机数  最后显示固定资产编号
 */
public class Simple06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份: ");
        int year = sc.nextInt();
        System.out.println("请输入产品类型: 1、台式机 2、笔记本 3、其他");
        int cate = sc.nextInt();
        int random = (int) (Math.random() * 1000);
        System.out.println(year + "0" + cate + random);
    }
}
