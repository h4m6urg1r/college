/*
Practical 1
AIM:
Design a java program to find the biggest of three given integers. Description: The name of class is Largest, having data members num1, num2, num3, res. Member functions of class are inputData(), findLargest() and displayLargest(). Make separate class to create void main. 
*/
class Largest {
    int num1, num2, num3, result;

    void inputData() {
        num1 = 8;
        num2 = 9;
        num3 = 10;
    }

    void findLargest() {
        if (num1 > num2 && num1 > num3) {
            result = num1;
        } else if (num2 > num3) {
            result = num2;
        } else {
            result = num3;
        }
    }

    void displayLargest() {
        System.out.println("Largest number = " + result);
    }
}

class Main {
    public static void main(String[] args) {
        Largest l = new Largest();
        l.inputData();
        l.findLargest();
        l.displayLargest();
    }
}
