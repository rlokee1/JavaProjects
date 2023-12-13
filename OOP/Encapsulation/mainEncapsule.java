package OOP.Encapsulation;

public class mainEncapsule {
    public static void main(String[]args){
        Employee e = new Employee();

        e.Name1("Lokesh");
        e.Age1(22);
        e.Salary1(20000.00f);

        System.out.println(e.Name2());
        System.out.println(e.Age2());
        System.out.println(e.Salary2());
    }
}
