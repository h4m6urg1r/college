/*
PRACTICAL 6
AIM : 
Design a java program to prompt user for an integer and print all the prime numbers up to that integer. 
Code :  
*/
import java.util.*;

class Primes {
    int value,num;
    int i;
    boolean isPrime;

    void inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        value = sc.nextInt();
    }
    void displayPrime() {
        System.out.println("Prime numbers: ");
        for(num=2; num<=value; num++) {
            isPrime = true;
            for(i=2; i<=(num/i); i++) {
                if(num%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(num + " " );
            }
        }
    }
}

class Main {
    public static void main(String args[]) {
        Primes p = new Primes();
        p.inputNumber();
        p.displayPrime();
    }
}
