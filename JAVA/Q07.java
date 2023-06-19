/*
PRACTICAL 7
AIM: 
Design a java program to check whether a string is palindrome or not. 
Code-
*/
import java.util.*;
class check {
    boolean isPalindrome(String data) {
        int i,len;
        len = data.length();
        for(i=0; i<=(len/2)-1; i++) {
            if (data.charAt(i)!=data.charAt(len-i-1))
                return false;
        }
        return true;
    }
}
class Main {
    public static void main(String args[]) {
        String str;
        check pc = new check();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :- ");
        str = sc.nextLine();
        if (pc.isPalindrome(str))
            System.out.println("Entered string is a palindrome");
        else
            System.out.println("Entered string is not a palindrome");
    }
}
