package cn.xiaoyes.note.day0929;

public class Test05 {
    public static void main(String[] args) throws Exception{

        Thread t1 = new Thread(() -> {
            int num = 0;
            while (num <= 10){
                System.out.println(Thread.currentThread().getName() + "---" + num);
                num++;
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int num = 0;
            while (num <= 10){
                System.out.println(Thread.currentThread().getName() + "---" + num);
                num++;
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int num = 0;
            while (num <= 10){
                System.out.println(Thread.currentThread().getName() + "---" + num);
                num++;
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
