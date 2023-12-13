package TaskMaster;

class Task {
    int a,b;
}

class Task1 extends Task{
    int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
}
class Task2 extends Task{
    int prod(int a,int b){
        int prod=a*b;
        return prod;
    }
}
class Task3 extends Task{
    int diff(int a,int b){
        int diff=a-b;
        return diff;
    }
}

public class Instant2_0{
    public static void main(String[]args){
        Task task = new Task();
        task.a=12;
        task.b=4;

        Task t = new Task3();           //Upcasting
        Task u = new Task2();
        Task v = new Task1();

        Task3 t3 = (Task3) t;           //Downcasting
        Task2 t2 = (Task2) u;
        Task1 t1 = (Task1) v;

        t1.sum(task.a, task.b);
        t2.prod(task.a, task.b);
        int ans = t3.diff(t1.sum(task.a, task.b),t2.prod(task.a, task.b));

        System.out.println("The Difference between sum and product is " + ans);

    }
}
