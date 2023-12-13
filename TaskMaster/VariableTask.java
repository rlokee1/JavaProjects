package TaskMaster;
import java.util.*;

class VariableTask { int m,n; }

class A {
    int userValue1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int c = sc.nextInt();
        return c;
    }
    int userValue2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int d = sc.nextInt();
        return d;
    }
}

class B {
    int x,y;
    int addTwo() {
        return x+y;
    }
}

class C {
    public static void main(String[] args) {
        A a1 = new A();

        VariableTask vt = new VariableTask();
        vt.m= a1.userValue1();
        vt.n= a1.userValue2();

        B b1 = new B();
        b1.x= vt.m;
        b1.y=vt.n;

        System.out.println(vt.m+" "+vt.n);
        System.out.println("The Sum value is " + b1.addTwo());
    }
}
