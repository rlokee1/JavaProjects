package TaskMaster;

class Leo implements Runnable {
    public void run() {
        System.out.println("Hi");
    }
}

class childThread extends Thread {
    public void start(){
        super.start();
        System.out.println("start");
    }
    public void run() {
        System.out.println("child");
    }
}

class Thread1 {
    public static void main(String[] Args) {
        Runnable r = new Leo();
        Thread th = new Thread(r);
        childThread chtr = new childThread();
        chtr.start();
    }
}
