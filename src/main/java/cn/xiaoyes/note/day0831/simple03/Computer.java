package cn.xiaoyes.note.day0831.simple03;

public class Computer {
    private char color;

    private int cpu;
    public Computer(){

    }

    public Computer(char color, int cpu) {
        this.color = color;
        this.cpu = cpu;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public void info(){
        System.out.println("笔记本颜色: " + getColor() + " 处理器型号: " + getCpu());
    }
}
