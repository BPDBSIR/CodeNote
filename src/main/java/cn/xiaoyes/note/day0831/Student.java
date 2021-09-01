package cn.xiaoyes.note.day0831;

/**
 * 我是一个类
 *
 */
public class Student {
    private String name;
    private double score;

    /**
     * 如果本类中没有构造方法，jvm会为我们默认加上一个午餐构造
     * 如果有有参构造，必须执行一个无参构造，否则不能调用午餐构造
     */
    public Student(){

    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
