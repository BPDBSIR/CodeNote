package cn.xiaoyes.note.day0913.stream;

import cn.xiaoyes.note.day0913.stream.pojo.Staff;

import java.util.ArrayList;
import java.util.List;

/**
 * Java8 Stream
 * https://mp.weixin.qq.com/s/KqmZr68kibsWuwrKup9J4g
 */
public class DataProvider {

    public static List<Staff> listStaffs() {
        List<Staff> list = new ArrayList<>();
        list.add(new Staff("张三", 15990));
        list.add(new Staff("李四", 6200));
        list.add(new Staff("王五", 5200));
        list.add(new Staff("赵六", 12990));
        list.add(new Staff("洪七", 7890));
        return list;
    }
}
