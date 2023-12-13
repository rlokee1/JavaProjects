package Multi_Threading;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("A");
            System.out.println(Thread.currentThread());
//            try {
//                Thread.sleep(2000);
//                System.out.println("lolo");
//            } catch (Exception ignored){
//            }
        }
    }
}

class Star extends Thread {
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("*");
            System.out.println(Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        A a = new A();                           //runnable - obj create
        Star s = new Star();
        a.start();                              //running - obj calling
        s.start();                              // has simultaneous effect
        s.setPriority(6);
        s.getPriority();
    }
}

