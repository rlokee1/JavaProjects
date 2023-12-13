package TaskMaster;

import java.util.Scanner;

public class MakePalindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        makePalindrome(str);
    }

    public static String makePalindrome(String str){
        String rev = new StringBuilder(str).reverse().toString();
        String s = str + rev;
        System.out.println(s);
        return s;
    }
}
