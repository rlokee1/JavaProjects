//class V{
//    synchronized void A(int z){
//        for(int i=0;i<=10;i++){
//            System.out.println(i*z);
//            try{Thread.sleep(1000);}
//            catch(Exception e){
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
//}
//class n extends Thread{
//    V v;
//    n (V v){
//        this.v=v;
//    }
//    public void run(){
//        v.A(3);
//    }
//}
//class m extends Thread{
//    V v;
//    m (V v){
//        this.v=v;
//    }
//    public void run(){
//        v.A(4);
//    }
//}
//public class sync {
//    public static void main(String[]args){
//        V nn=new V();
//        n nm=new n(nn);
//        m nmm=new m(nn);
//        nm.start();
//        nmm.start();
//    }
//}
//
//class thr extends Thread{
//    public void run(){
//        while (true){
//            System.out.println("saaaa");
//        }
//    }
//    public static void main(String[]args){
//        thr kk=new thr();
//        kk.setDaemon(true);
//        kk.start();
//        for(int i=0;i<5;i++){
//            System.out.println("sabari");
//        }
//    }
//}