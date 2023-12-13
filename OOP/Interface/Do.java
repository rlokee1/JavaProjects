package OOP.Interface;

interface one {
    void A();
    void B();
    void C();
    void D();
}
interface two{
    void E();
    void F();
    void G();
    void H();
}
 abstract class Task implements one,two{
    abstract void ABS();

    public void A(){
        System.out.println("A");
    }
    public void B() { System.out.println("B"); }
    public void C() { System.out.println("C"); }
    public void D(){
        System.out.println("D");
    }
    public void E(){
        System.out.println("E");
    }
    public void F(){
        System.out.println("F");
    }
    public void G(){
        System.out.println("G");
    }
    public void H(){
        System.out.println("H");
    }
}

class Do extends Task {
    public static void main(String[]args){
        Do d = new Do();
        d.A();d.B();d.C();d.D();d.E();d.F();d.G();d.H();
}
    void ABS() {
        System.out.println("When abstrct method is given by definition in child class,it is normal class");
    }
}

