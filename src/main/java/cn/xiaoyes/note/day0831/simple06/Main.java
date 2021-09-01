package cn.xiaoyes.note.day0831.simple06;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("小黑", "110", 99);
        Student s2 = new Student("小花", "120", 92);
        Student s3 = new Student("小绿", "130", 100);
        Student s4 = new Student("小紫", "140", 120);
        Student[] students = {s1, s2, s3, s4};
        studentScore(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }


    public static void studentScore(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int x = 0; x < students.length - i - 1; x++) {
                if (students[x].getScore() < students[x + 1].getScore()){
                    Student tem = students[x];
                    students[x] = students[x + 1];
                    students[x + 1] = tem;
                }
            }
        }
    }
}
