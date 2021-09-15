package cn.xiaoyes.note.day0915;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    private List<Student> list = new ArrayList<>();

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }


    public void addStudent(int num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第" + i + "个学生的学号: ");
            String no = sc.next();
            System.out.println("请输入第" + i + "个学生的姓名: ");
            String name = sc.next();
            list.add(new Student(no, name));
        }
    }

    public boolean isExists(String no) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum().equals(no)) {
                return true;
            }
        }
        return false;
    }

    public void getStudent(String no) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum().equals(no)) {
                System.out.println(list.get(i));
                break;
            }
        }
    }

    public boolean deleteStudent(String no){
        boolean exists = isExists(no);
        if (exists){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getNum().equals(no)){
                    list.remove(i);
                    return true;
                }
            }
        }else {
            System.out.println("此学生不存在");
        }
        return false;
    }

    public void listStudents(){
        list.forEach(System.out::println);
    }
}
