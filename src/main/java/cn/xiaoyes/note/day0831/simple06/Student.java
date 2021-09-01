package cn.xiaoyes.note.day0831.simple06;

public class Student {
    private String name;

    private String num;

    private double score;

    public Student() {

    }

    public Student(String name, String num, double score) {
        this.name = name;
        this.num = num;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "姓名: " + getName() + " 学号: " + getNum() + " 成绩: " + getScore();
    }
}
