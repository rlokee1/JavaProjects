package Multi_Threading;

import java.sql.DriverManager;
import java.sql.SQLException;

class Daemon extends Thread {
    public void run() {
        while (true) {
            System.out.println("Infinite");
        }
    }
}

class Daemon1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("*");
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Daemon s = new Daemon();
        Daemon1 s1 = new Daemon1();
        s.setDaemon(true);
        s.start();
        sleep(1000);
        s1.start();
    }
}
