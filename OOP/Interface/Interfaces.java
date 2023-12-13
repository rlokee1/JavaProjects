package OOP.Interface;
interface A{
    //abstract void print();
}
interface B{
    void show();
}

class Interfaces implements A,B{
    public void print() {
        System.out.println("print");
    }
    public void show() {
        System.out.println("show");
    }
    public static void main(String[]args){
        Interfaces i = new Interfaces();
        i.print();
        i.show();
    }
}
