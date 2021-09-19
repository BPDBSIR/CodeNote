package cn.xiaoyes.note.day0917;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

        String[] arr = new String[]{"", "朱辛庄", "育知路", "平西府", "回龙观东大街", "霍营", "育新", "西小口", "永泰庄", "林萃桥", "森林公园南门", "奥林匹克公园", "奥体中心", "北土城"};
        Map<Integer, String> map = new HashMap<>();
        for (int i = 1; i < arr.length; i++) {
            map.put(i, arr[i]);
        }
        map.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
        Scanner input = new Scanner(System.in);
        int upKey = 0;
        int doKey = 0;
        String upStotion;
        String doStotion;
        int Money = 0;
        int Time = 0;

        for (; ; ) {
            System.out.println("请输入上车站");
            upStotion = input.next();
            if (map.containsValue(upStotion)) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    if (entry.getValue().equals(upStotion)) {
                        upKey = entry.getKey();
                    }
                }
                break;
            } else {
                System.out.println("您输入的" + upStotion + "有误" + ",请重新输入上车站");
            }
        }
        for (; ; ) {
            System.out.println("请输入下车站");
            doStotion = input.next();
            if (map.containsValue(doStotion)) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    if (entry.getValue().equals(doStotion)) {
                        doKey = entry.getKey();
                    }
                }
                break;
            } else {
                System.out.println("您输入的" + doStotion + "有误" + ",请重新输入下车站");
            }
        }

        int station = Math.abs(doKey - upKey);
        if (station >= 9) {
            Money = 10;
        } else if (station > 5) {
            Money = 4 + (station - 5) * 2;
        } else if (station > 3) {
            Money = 4;
        } else {
            Money = 3;
        }
        Time = station * 2;
        System.out.println("您从" + upStotion + "到" + doStotion + "共路过" + station + "站" + "用时" + Time + "价格" + Money);
    }

    public static Integer charge(HashMap<Integer, String> al, Integer Price) {

        return 1;
    }
}


