package cn.xiaoyes.note.day0917;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * .站编号和站名对应关系如下：
 * <p>
 * 1=朱辛庄
 * 2=育知路
 * 3=平西府
 * 4=回龙观东大街
 * 5=霍营
 * 6:=育新
 * 7=西小口
 * 8= 永泰庄
 * 9=林萃桥
 * 10=森林公园南门
 * 11=奥林匹克公园
 * 12= 奥体中心
 * 13= 北土城
 * <p>
 * 2.计算地铁票价规则：
 * <p>
 * 总行程 3站内（包含3站）收费3元，
 * <p>
 * 3站以上但不超过5站（包含5站）的收费4元，
 * <p>
 * 5站以上的，在4元的基础上，每多1站增加2元，
 * <p>
 * 10元封顶；
 * <p>
 * 3.打印格式（需要对键盘录入的上车站和到达站进行判断，如果没有该站，提示重新输入，直到站名存在为止）：
 * <p>
 * 注意：每站需要2分钟
 * <p>
 * 请输入上车站：
 * <p>
 * 沙河
 * <p>
 * 您输入的上车站：沙河不存在，请重新输入上车站：
 * <p>
 * 上地
 * <p>
 * 您输入的上车站：上地不存在，请重新输入上车站：
 * <p>
 * 朱辛庄
 * <p>
 * 请输入到达站：
 * <p>
 * 沙河
 * <p>
 * 您输入的到达站：沙河不存在，请重新输入到达站：
 * <p>
 * 西二旗
 * <p>
 * 您输入的到达站：西二旗不存在，请重新输入到达站：
 * <p>
 * 西小口
 * <p>
 * 从朱辛庄到西小口共经过6站收费6元，大约需要 12分钟
 */
public class Simple03 {
    public static void main(String[] args) {
        start();
    }
    public static void start() {
        List<Platform> platforms = platformDataProvider();
        Scanner sc = new Scanner(System.in);
        String upper = "";
        String lower = "";
        while (true) {
            System.out.println("请输入上车站: ");
            upper = sc.next();
            if (!selectPlatformExist(platforms, upper)) {
                System.out.println("您输入的上车站：" + upper + "不存在，请重新输入上车站：");
                continue;
            } else
                break;
        }
        while (true) {
            System.out.println("请输入到达站: ");
            lower = sc.next();
            if (!selectPlatformExist(platforms, lower)) {
                System.out.println("您输入的到达站：" + lower + "不存在，请重新输入到达站：");
                continue;
            } else
                break;
        }
        String s = "从朱辛庄到西小口共经过6站收费6元，大约需要 12分钟";
        int step = 0;
        for (int i = 0; i < platforms.size(); i++) {
            Platform p = platforms.get(i);
            if (p.getNum() > getPlatformIdByName(platforms, upper) && p.getNum() <= getPlatformIdByName(platforms, lower)) {
                step++;
            }
        }
        System.out.println(step);
        double money = 0;
        if (step <= 3) {
            money = 3;
        } else if (step <= 5) {
            money = 4;
        }
        money += (step - 5) * 2;
        System.out.println("从" + upper + "到" + lower + "共经过" + step + "站收费" + money + "元，大约需要 " + step * 2 + "分钟");
    }
    /**
     * 判断站台是否存在
     *
     * @param platforms
     * @param s
     * @return
     */
    public static boolean selectPlatformExist(List<Platform> platforms, String s) {
        for (Platform platform : platforms) {
            if (platform.getName().equals(s)) {
                return true;
            }
        }
        return false;
    }
    /**
     * 根据名字获取ID
     *
     * @param platforms
     * @param name
     * @return
     */
    public static Integer getPlatformIdByName(List<Platform> platforms, String name) {
        for (Platform platform : platforms) {
            if (platform.getName().equals(name)) {
                return platform.getNum();
            }
        }
        return -1;
    }
    public static List<Platform> platformDataProvider() {
        List<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(1, "朱辛庄"));
        platforms.add(new Platform(2, "育知路"));
        platforms.add(new Platform(3, "平西府"));
        platforms.add(new Platform(4, "回龙观东大街"));
        platforms.add(new Platform(5, "霍营"));
        platforms.add(new Platform(6, "育新"));
        platforms.add(new Platform(7, "西小口"));
        platforms.add(new Platform(8, "永泰庄"));
        platforms.add(new Platform(9, "林萃桥"));
        platforms.add(new Platform(10, "森林公园南门"));
        platforms.add(new Platform(11, "奥林匹克公园"));
        platforms.add(new Platform(12, "奥体中心"));
        platforms.add(new Platform(13, "北土城"));
        return platforms;
    }
    static class Platform {
        private Integer num;

        private String name;

        public Platform() {

        }
        public Platform(Integer num, String name) {
            this.num = num;
            this.name = name;
        }
        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
