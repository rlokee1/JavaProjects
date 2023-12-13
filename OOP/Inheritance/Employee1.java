package OOP.Inheritance;

class Employee1 {
    String empname;
    int empid;
    float salary;
    Address address;
    }

    class Developer extends Employee1{
        long accountnumber;
        String ifsc;

        Developer(String empname,int empid,float salary,long accountnumber,String ifsc, Address address){
         this.empname=empname;
         this.empid=empid;
         this.salary=salary;
         this.accountnumber=accountnumber;
         this.ifsc=ifsc;
         this.address=address;

         System.out.println(empname+'\n'+empid+'\n'+salary+'\n'+accountnumber+'\n'+ifsc+'\n'+address.city+'\n'+address.state+'\n'+address.zipcode);
        }

    public static void main(String[]args){
        Address address =new Address("Chennai","tamil Nadu", 600021);
        Developer dev = new Developer("Lokesh",511518,20000.50f,37003002708L,"SBIN0005593",address);
    }
}