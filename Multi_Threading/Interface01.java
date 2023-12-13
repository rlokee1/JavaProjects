package Multi_Threading;

class Interface01 implements Runnable {
    public void run() {
        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        }
    }
}

class Interface02 implements Runnable {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Interface01 i1 = new Interface01();
        Interface02 i2 = new Interface02();
        Thread t1 = new Thread(i1);
        Thread t2 = new Thread(i2);
        t1.start();
        t2.start();
    }
}
