package Multi_Threading;

import java.util.Scanner;
class Transact{
int balance;
}

class Deposit extends Thread{

    public void run(){
        Transact Tr;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the amount to be Deposit");
        int d = s1.nextInt();
        //Tr.balance=200;
        //System.out.println("You deposit " + d +" successfully and the current balance is " + balance);
    }
}
class Withdraw extends Deposit{
    public void run(){
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the amount to be Withdraw");
        int w = s2.nextInt();
        //balance = w;
        //System.out.println("You withdraw " + w +" successfully and the current balance is " + balance);
    }
}


public class Banking {

    public static void main(String[]args){
        Withdraw w1 = new Withdraw();
        Deposit d1 = new Deposit();
        w1.start();
        d1.start();
    }
}