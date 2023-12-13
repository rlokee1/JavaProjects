package InnerClass;

interface Demo{
    void m1();
}
public abstract class Outer {
    abstract void method();
    abstract void sample();

    public static void main(String[]args){
        Outer o = new Outer() {
            void method() {
                System.out.println("Method");
            }
            void sample() {
                System.out.println("Sample");
            }
        };
        o.method();
        o.sample();
        Demo d = new Demo() {
            public void m1() {
                System.out.println("Abstract method");
            }
        };
        d.m1();
    }
}
