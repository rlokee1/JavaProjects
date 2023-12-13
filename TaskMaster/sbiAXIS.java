package TaskMaster;

import java.util.Scanner;

class sbiAXIS {
    public static void main(String[]args){
        SBI sbi = new AXIS();               //Upcasting
        sbi.counter();                      //Single child call
    }
}

class SBI{
    void counter(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the TaskMaster.SBI entry value : ");
        int count=s.nextInt();
        for(int i=1;i<=count;i++){
            System.out.println("The TaskMaster.SBI Entry count is " + i);
        }
    }
}
class AXIS extends SBI{
    void counter(){
        super.counter();                        // super used to invoke parent class
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the TaskMaster.AXIS entry value : ");
        int count=s.nextInt();
        for(int i=1;i<=count;i++){
            System.out.println("The TaskMaster.AXIS Entry count is " + i);
        }
    }
}
