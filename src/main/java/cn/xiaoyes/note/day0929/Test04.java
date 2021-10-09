package cn.xiaoyes.note.day0929;

public class Test04 {
    public static void main(String[] args) {
        // 方式一
        CustomThread t1 = new CustomThread();
        // 方式二
        Thread t2 = new Thread(new CustomRunnable());
        t1.start();
        t2.start();
        // 方式三
        new Thread(new Runnable() {
            @Override
            public void run() {
                int num = 0;
                while (num <= 100){
                    System.out.println(Thread.currentThread().getName() + "---" + num);
                    num++;
                }
            }
        }).start();
    }

    static class CustomThread extends Thread{

        @Override
        public void run() {
            int num = 0;
            while (num <= 100){
                System.out.println(Thread.currentThread().getName() + "---" + num);
                num++;
            }
        }
    }
    static class CustomRunnable implements Runnable{

        @Override
        public void run() {
            int num = 0;
            while (num <= 100){
                System.out.println(Thread.currentThread().getName() + "---" + num);
                num++;
            }
        }
    }
}
