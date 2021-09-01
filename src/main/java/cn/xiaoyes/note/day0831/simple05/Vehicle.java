package cn.xiaoyes.note.day0831.simple05;

public class Vehicle {

    private String brand;

    private String color;

    private double speed;

    public Vehicle(){

    }

    public Vehicle(String brand,String color){
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void run(){
        System.out.println("我的名字叫: " + getBrand() + " 颜色: " + getColor() + " 速度: " + getSpeed());

    }
}
