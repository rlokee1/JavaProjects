package OOP.Encapsulation;

public class Employee {

    private String name;
    private int age;
    private float salary;

    public void Name1(String a) {
        name = a;
    } //set method

    public void Age1(int b) {
        age = b;
    }

    public void Salary1(float c) {
        salary = c;
    }

    public String Name2() {
        return name;
    } //get method

    public int Age2() {
        return age;
    }

    public float Salary2() {
        return salary;
    }
}