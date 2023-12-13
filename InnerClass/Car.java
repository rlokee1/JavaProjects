package InnerClass;

class Car {
    private String brand;

    public Car(String brand){
        this.brand=brand;
    }

    class Engine{
        public void start(){
            System.out.println("Starting "+brand + " engine");
        }
    }

    public static void main(String[]args){
        Car c = new Car("Toyota");
        Car.Engine ce = c.new Engine();
        ce.start();
    }
}
