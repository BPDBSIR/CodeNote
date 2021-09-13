package cn.xiaoyes.note.day0913.stream.pojo;

/**
 * 员工
 */
public class Staff {

    /**
     * 姓名
     */
    private String name;

    /**
     * 薪水
     */
    private double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "姓名: " + getName() + " 薪水: " + getSalary();
    }
}
