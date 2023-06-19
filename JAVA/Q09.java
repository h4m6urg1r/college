/*
PRACTICAL 9
AIM :  
Design a java program to implement stack and queue concept. 
Code :  
*/
class Stack {
    int stck[];
    int top;

    Stack(int size) {
        stck = new int[size];
        top = 0;
    }

    void push(int item) {
        if (top == stck.length)
            System.out.println("Stack overflow.");
        else
            stck[top++] = item;
    }

    int pop() {
        if (top < 1) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stck[--top];
    }
}

class Main {
    public static void main(String args[]) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        for (int i = 0; i < 5; i++)
            mystack1.push(i);
        for (int i = 0; i < 8; i++)
            mystack2.push(i);
        System.out.println("Stack in mystack1:");

        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
