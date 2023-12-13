package TaskMaster;

import java.lang.Object;

public class Garbage {
    void sample() {
        System.out.println("Hello");
    }
    public int add(){
        int a = 10;
        return a;
    }

    public void finalize(){
        System.out.println("garbage");
    }

    public static void main(String[] args) {
        Garbage g = new Garbage();
        g.add();
        g.sample();
 //       g = null;
        System.gc();
    }
}
