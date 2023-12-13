package TaskMaster;

public class Sync_A {
    public synchronized void wish(){
        for(int i =0;i<4;i++){
            System.out.println("Good Morning ");
            try{
                Thread.sleep(2500);
            }catch(Exception ignored){}
        }
    }
}

class Sync_B extends Thread{
    Sync_A s;
    String name;
    Sync_B(Sync_A s,String name){
        this.s=s;
        this.name=name;
    }
    public void run(){
        s.wish();
    }

    public static void main(String[]args){
        Sync_A sa = new Sync_A();
        Sync_B sb = new Sync_B(sa,"Ma'am");
        Sync_B sb1= new Sync_B(sa,"Sir");
        sb.start();
        sb1.start();
    }
}