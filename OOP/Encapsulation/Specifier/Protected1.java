package OOP.Encapsulation.Specifier;

public class Protected1 {
    public static void main(String[]args){
    Protected1 p = new Protected1();
    //p.see();
    }
}

class Tree{
    void see1(){
    System.out.println("Lokesh");
}
}
class Banyan extends Tree{
    void see(){
        System.out.println("Lokesh is bad boy");
    }
}