package cn.xiaoyes.note.day0913;


public class Goods {

    private Integer goodNo;

    private String goodsName;

    private double price;

    public Goods(){

    }

    public Goods(Integer goodNo, String goodsName, double price) {
        this.goodNo = goodNo;
        this.goodsName = goodsName;
        this.price = price;
    }

    public Integer getGoodNo() {
        return goodNo;
    }

    public void setGoodNo(Integer goodNo) {
        this.goodNo = goodNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodNo=" + goodNo +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                '}';
    }
}
