/*
PRACTICAL 5
AIM: 
Design a java program that uses both recursive and non-recursive methods to print the nth value of the Fibonacci series sequence. 
Code :  
*/
class Fibonacci_with_recursion {
    int a = 0, b = 1, temp = 0;

    void printFibonacci(int count) {
        if (count > 0) {
            temp = a + b;
            System.out.print(b + " ");
            a = b;
            b = temp;
            printFibonacci(count - 1);
        }
    }
}

class Fibonacci_without_recursion {
    int a = 0, b = 1, temp = 0;

    void fibonaaci2(int count) {
        for (int i = 0; i < count; ++i) { // loop starts from 2 because 0 and 1 are already printed
            temp = a + b;
            System.out.print(b + " ");
            a = b;
            b = temp;
        }
    }
}


class Main {
    public static void main(String[] args) {
        Fibonacci_with_recursion f = new Fibonacci_with_recursion();
        System.out.println("Fibonacci with recursion : ");
        f.printFibonacci(7);
        Fibonacci_without_recursion f2 = new Fibonacci_without_recursion();
        System.out.println("\n");
        System.out.println("Fibonacci without recursion : ");
        f2.fibonaaci2(7);
        System.out.println("\n");
    }
}
