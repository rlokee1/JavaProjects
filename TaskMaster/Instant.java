package TaskMaster;

public class Instant {
    int a,b;
    int sum(int a,int b){
       int sum=a+b;
       return sum;
    }
    int prod(int a,int b){
        int prod=a*b;
        return prod;
    }
    int diff(int sum,int prod){
        int diff = sum - prod;
        return diff;
    }

    public static void main(String[]args){
        Instant i = new Instant();
        i.a=7;
        i.b=3;
        i.sum(i.a,i.b);
        i.prod(i.a,i.b);
        int diff = i.diff(i.sum(i.a, i.b),i.prod(i.a, i.b) );

        System.out.println(diff);
    }
}


