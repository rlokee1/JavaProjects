class upDownCasting
    {
        public static void main(String[] args) {
            Parent p = new Child();
            p.act();
        }
    }
class Parent
    {
        void act(){
            System.out.println("parent");
        }
    }

class Child extends Parent
    {
        void play(){
            System.out.println("Child");
        }
    }