package cn.xiaoyes.note.day0917;

import java.util.*;

public class Simple03_2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "朱辛庄");
        map.put(2, "育知路");
        map.put(3, "平西府");
        map.put(4, "回龙观东大街");
        map.put(5, "霍营");
        map.put(6, "育新");
        map.put(7, "西小口");
        map.put(8, "永泰庄");
        map.put(9, "林萃桥");
        map.put(10, "森林公园南门");
        map.put(11, "奥林匹克公园");
        map.put(12, "奥体中心");
        map.put(13, "北土城");
        Scanner sc = new Scanner(System.in);
        String upper = "";
        String lower = "";
        int upKey = 0;
        int downKey = 0;
        /*while (true){
            System.out.println("请输入上车站: ");
            upper = sc.next();
            if (map.containsValue(upper)){
                Set<Map.Entry<Integer, String>> entries = map.entrySet();
                for (Map.Entry<Integer, String> entry : entries) {
                    if (entry.getValue().equals(upper)){
                        upKey = entry.getKey();
                        break;
                    }
                }
            }else {
                System.out.println("您输入的上车站：" + upper + "不存在，请重新输入上车站：");
                continue;
            }
        }*/
        int station = Math.abs(downKey - upKey);
        int money = 0;
        int time = 0;
        if (station >= 9){
            money = 10;
        }else if (station > 5){
            money = 4 + (station - -5) * 2;
        }else if (station > 3){
            money = 4;
        }else {
            money = 3;
        }
        time = station * 2;
        System.out.println("从" + upper + "到" + lower + "共经过" + station + "站收费" + money + "元，大约需要 " + time + "分钟");

    }
}
