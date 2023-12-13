package Interview_programs;

/*import java.util.Scanner;

public class UserPalindrome {
    public static void main(String[] args){
        String original,reverse="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check if it's palindrome or not : ");
        original = sc.nextLine();
        for(int i = original.length()-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse))
            System.out.println("Entered word is a palindrome");
        else
            System.out.println("Entered word is not a palindrome");

    }
}
*/

import java.util.*;

class Palindrome {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the string");
        String inputStr = scanner.next();
        System.out.println("Given String = " + inputStr);
        char[] charArray = inputStr.toCharArray();
        int strlength = (charArray.length) - 1;
        boolean isPalindrom = true;
        for (int count = 0; count == 0; count++, strlength--) {
            if (charArray[count] != charArray[strlength]) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}

