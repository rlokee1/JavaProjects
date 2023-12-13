package InnerClass;

public class Factorial {
    public int calculateFactorial(int number) {

        class FactorialCalculator {
            public int calculate(int num) {
                if (num < 0) {
                    throw new IllegalArgumentException("Factorial is not defined for negative numbers");
                } else if (num == 0 || num == 1) {
                    return 1;
                } else {
                    int result = 1;
                    for (int i = 2; i <= num; i++) {
                        result *= i;
                    }
                    return result;
                }
            }
        }

        FactorialCalculator fc = new FactorialCalculator();
        return fc.calculate(number);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        int number = 5;
        int factorial = f.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}