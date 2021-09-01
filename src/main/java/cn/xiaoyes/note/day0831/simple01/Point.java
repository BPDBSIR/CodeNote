package cn.xiaoyes.note.day0831.simple01;

public class Point {
    private int x;
    private int y;


    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void movePoint(int dx, int dy) {
        this.x = dx;
        this.y = dy;
        System.out.println("x坐标: " + x + " y坐标: " + y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
