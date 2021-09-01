package cn.xiaoyes.note.day0831.simple02;

public class Rectangle {

    /**
     * 宽
     */
    private float width;

    /**
     * 长
     */
    private float length;

    public Rectangle() {

    }

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    /**
     * 计算面积
     * @return
     */
    public float getArea(){
        return length / width;
    }

    /**
     * 周长
     * @return
     */
    public float getPer(){
        return (length + width) / 2;
    }

    /**
     * 打印输出
     */
    public void showAll(){
        System.out.println("长: " + length + " 宽: " + width + " 面积: " + getArea() + " 周长: " + getPer());
    }
}
