package TaskMaster;

class CallLocal{
    int totalmethod(){
        int a=10,b=10,c=10,d=10,e=10;
        int total=a+b+c+d+e;
        return total;
    }
}
    class Call{
            void average(int santhosh){
            int avg = santhosh/5;
            System.out.println(avg);
        }
        public static void main(String[]args){
            CallLocal cl = new CallLocal();
            Call c = new Call();
            cl.totalmethod();
            c.average(cl.totalmethod());
        }
    }
