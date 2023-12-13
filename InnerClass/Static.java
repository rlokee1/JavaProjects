package InnerClass;

public class Static {
    static int a =100;
    static void method(){
        System.out.println("Static method");
    }
    static class Inner{
        void sample(){
            System.out.println(a);
            method();
        }
    }
    public static void main(String[]args){
        Static s = new Static();
        s.method();
        Static.Inner in = new Static.Inner();
        in.sample();
    }
}
