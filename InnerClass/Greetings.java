package InnerClass;

public class Greetings {
    // Define the Greeting interface
    interface Greeting {
        void sayHello();
    }

    public static void main(String[] args) {
        // Implement the Greeting interface using an anonymous inner class
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, world!");
            }
        };
        // Call the sayHello() method using the anonymous inner class
        greeting.sayHello();
    }
}

