package Multi_Threading;

import java.sql.SQLOutput;

class DeadLock {
    public synchronized void first(DeadLock1 t1) {
        System.out.println("first is running");
        try {
            Thread.sleep(5000);
        } catch (Exception ignored) {}
        System.out.println("Trying to call second");
        t1.fourth();
    }
    public synchronized void second(){
        System.out.println("second is running");
    }
}

class DeadLock1{
    public synchronized void third(DeadLock t2) {
        System.out.println("third is running");
        try {
            Thread.sleep(5000);
        } catch (Exception ignored) {}
        System.out.println("Trying to call fourth");
        t2.second();

    }
    public synchronized void fourth(){
        System.out.println("fourth is running");
    }
}

class DeadLock2 extends Thread{
    DeadLock d = new DeadLock();
    DeadLock1 d1 =new DeadLock1();

    void fifth(){
        start();
        d.first(d1);
    }public void run(){
        d1.third(d);
    }

    public static void main(String[]args){
        DeadLock2 d2 = new DeadLock2();
        d2.fifth();
    }
}