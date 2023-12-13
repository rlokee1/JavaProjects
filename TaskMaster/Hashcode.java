package TaskMaster;

public class Hashcode {

    public static void main(String[] args) {
        Hashcode h = new Hashcode();
        System.out.println(h);
        Hashcode h1 = new Hashcode();
        h = h1;
        System.gc();

        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.freeMemory());
        System.out.println(rt.totalMemory());
        System.out.println(rt.totalMemory()-rt.freeMemory());
    }
}