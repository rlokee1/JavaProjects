package TaskMaster;

class OddNumberException extends RuntimeException
{
    OddNumberException(){
        super();
    }
}
class UserException {
    void check(int a1){
        int a = a1;
        if(a%2==0){
            System.out.println(a);
        }
        else{
            throw new OddNumberException();
        }
    }
    public static void main(String[]args){
        UserException u = new UserException();
        u.check(5);
    }
}
