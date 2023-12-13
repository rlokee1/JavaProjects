package TaskMaster;

import java.util.Scanner;

class UserExe_Details {
    Scanner sc = new Scanner(System.in);
    void act(){
        while(true) {
            try {
                System.out.println("Enter your id : ");
                int id = sc.nextInt();
                System.out.println("Enter your Phone No : ");
                long phone = sc.nextLong();
                System.out.println("Enter your name : ");
                String name = sc.nextLine();


                System.out.println(id + '\n' + name + '\n' + phone);

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Error : Please enter valid input");
            }
            //if(id == (int) && name == String && phone == long)
        }
    }
    public static void main(String[]args){
        UserExe_Details user = new UserExe_Details();
        user.act();
    }
}
