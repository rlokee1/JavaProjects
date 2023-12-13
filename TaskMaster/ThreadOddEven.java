package TaskMaster;

public class ThreadOddEven {
    int i=1;

    public synchronized void odd() {
        while (i <= 100) {
            if (i % 2 == 1) {
                System.out.println(i);
                i++;
                notify();
            }
            else{
                try {
                    wait();
                } catch (Exception ignored) {}
        }
    }
}

    public synchronized void even() {
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
                i++;
                notify();
            }
            else {
                try {
                    wait();
                } catch (Exception ignored) {}
            }
        }
    }
}

class OddEven {
    public static void main(String[] args) {
        ThreadOddEven toe = new ThreadOddEven();
        Thread t1 = new Thread()
        {
            public void run(){
                toe.odd();
            }
        };
        Thread t2 = new Thread()
        {
            public void run(){
                toe.even();
            }
        };
        t1.start();
        t2.start();
    }
}