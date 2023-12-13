class Practiz {
    public static void main(String[] args)
    {
        A p = new B();
    }
}
    class A{
         void act(){
                System.out.println("A");
            }
}
    class B extends A{
            void act(){
                super.act();
                System.out.println("act B");
            }
        void play(){
            System.out.println("play B");
            }
}
    class C extends A {
        void act() {
                System.out.println("Act C");
        }
        void play(){
            System.out.println("play C");
        }
    }
    class D extends A{
    void act(){
        System.out.println("act D");
    }
}


