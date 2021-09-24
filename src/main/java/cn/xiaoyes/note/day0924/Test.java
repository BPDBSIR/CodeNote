package cn.xiaoyes.note.day0924;

public class Test {

    final Object s = new Object();


    static class Base{
        int s = 10;
        public void run(){
            System.out.println("run");
        }
    }
    static class Sub extends Base{
        int s = 20;

        @Override
        public void run() {
            System.out.println("adsasd");
        }
    }

    public static void main(String[] args) {
        /*Base b =  new Sub();
        Sub s = (Sub) b;
        s.run();
        final String sss = "";

        int[][] ss = new int[12][5];
        System.out.println(ss);*/
        Base b = new Sub();
        b.run();
        System.out.println(b.s);
    }
    public final void aa(){

    }



}
