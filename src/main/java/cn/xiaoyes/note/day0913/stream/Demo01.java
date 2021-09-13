package cn.xiaoyes.note.day0913.stream;

import cn.xiaoyes.note.day0913.stream.pojo.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 从员工集合中筛选出 salary 大于 8000 的员工，并放置到新的集合里。
 */
public class Demo01 {
    public static void main(String[] args) {
        List<Staff> staffs = DataProvider.listStaffs();
        List<Staff> staff = demo01(staffs);
        staff.forEach(System.out::println);
    }

    /**
     * 传统方式
     * @return
     */
    public static List<Staff> demo01(List<Staff> data){
        List<Staff> returnList = new ArrayList<>();
        /*List<Staff> collect = data.stream().filter(staff -> staff.getSalary() > 8000).collect(Collectors.toList());
        System.out.println(collect);*/
        data.forEach(staff -> {
            if (staff.getSalary() > 8000){
                returnList.add(staff);
            }
        });
        return returnList;
    }
}
