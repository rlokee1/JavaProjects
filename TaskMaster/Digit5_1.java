package TaskMaster;

public class Digit5_1 {
    void action(){
        int num1 =123450;
        int num2=100000;
        while(num2>0){
            System.out.println(num1/num2);
            num1%=num2;
            num2/=10;
        }
    }

    public static void main(String[]args){
        Digit5_1 d = new Digit5_1();
        d.action();
    }
}
