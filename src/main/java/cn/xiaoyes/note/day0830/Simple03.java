package cn.xiaoyes.note.day0830;

/**
 * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 * 示例 1：
 * <p>
 * 输入：[4,2,1]
 * <p>
 * 输出：4
 * <p>
 * 解释：第一堆力扣币最少需要拿 2 次，第二堆最少需要拿 1 次，第三堆最少需要拿 1 次，总共 4 次即可拿完。
 * 示例 2：
 * <p>
 * 输入：[2,3,10]
 * <p>
 * 输出：8
 */
public class Simple03 {
    public static void main(String[] args) {
        int[] coins = {2, 3, 10};
        int count = 0;
        // 按照一次最大拿两枚币
        for (int coin : coins) {
            // 判断数量是否为偶数
            if (coin % 2 == 0) {
                // 直接除以2并且赋值
                count += coin / 2;
            } else {
                // 如果为奇数 / 2 + 1
                count += coin / 2 + 1;
            }
        }
        System.out.println(count);
    }
}
