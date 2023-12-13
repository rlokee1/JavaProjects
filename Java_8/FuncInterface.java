package Java_8;
import java.time.LocalDate;

interface Sample1{
    void method();                                                  //Single method->Functional Interface
}
class FuncInterface {
    void demo()
    {
        System.out.println("Method Reference");
    }
    public static void main(String[]args)
    {
        Sample1 s1=()->System.out.println("Method Reference 1");
        s1.method();
        FuncInterface f = new FuncInterface();
        Sample1 s = f::demo;                                        //Method Reference
        s.method();
    }
}
