package TaskMaster;

abstract class Abs_Override {
    int a=10,b=5;
    abstract int action();

}

class A1 extends Abs_Override{
    int action(){
        return a+b;
    }
}

class A2 extends Abs_Override{
    int action(){
        return a-b;
    }
}
class A3 extends Abs_Override{
    int action(){
        return a*b;
    }
}
class A4 extends Abs_Override{
    int action(){
        return a/b;
    }
}

class A5 extends Abs_Override{
    int action(){
        return a%b;
    }
}

class A7{
    public static void main(String[]args){
        A1 a1 = new A1();
        System.out.println("Add is " + a1.action());
        A2 a2 = new A2();
        System.out.println("sub is " + a2.action());
        A3 a3 = new A3();
        System.out.println("Multiply is " + a3.action());
        A4 a4 = new A4();
        System.out.println("Divide is " + a4.action());
        A5 a5 = new A5();
        System.out.println("Modulus is " + a5.action());
    }
}
