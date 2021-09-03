package cn.xiaoyes.note.day0903;

/**
 * 把int类型的数组，变成字符串，例如:int[] arr={1,2,3,4,56}变成字符串[56,4,3,2,1]
 */
public class Simple07 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 56};
        /* 方式一 */
        /*for (int i = 0; i < arr.length - 1; i++) {
            for (int x = 0; x < arr.length -i - 1; x++) {
                if (arr[x] < arr[x + 1]){
                    int tm = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = tm;
                }
            }
        }
        System.out.println(Arrays.toString(arr));*/
        /* 方式二 */
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(",");
            }
        }
        System.out.println("[" + sb + "]");
    }
}
