package cn.xiaoyes.note.day1011;

public class TicketDemo {

    static class Ticket implements Runnable {

        int ticket = 100;

        Object lock = new Object();

        @Override
        public void run() {
            while (ticket > 0) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock){
                    outTicket();
                }
            }
        }
        public void outTicket(){
            if (ticket > 0){
                ticket--;
                System.out.println(Thread.currentThread().getName() + "卖出了第" + (100 - ticket) + "张票");
            }
        }
    }


    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket, "窗口1");
        Thread thread2 = new Thread(ticket, "窗口2");
        Thread thread3 = new Thread(ticket, "窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
