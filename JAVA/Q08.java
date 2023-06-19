/*
PRACTICAL 8
AIM: 
Design a java program that reads a line of integers, then display each integer and the sum of all integers. 
*/
import java.util.*;

class Main {

    public static void inputArr(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
    }

    public static void CalcSum(int arr[], int sum) {
        sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is: " + sum );
    }

    public static void main(String args[]) {
        int size;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add :- ");
        size = scn.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the numbers: ");
        inputArr(arr);
        CalcSum(arr, size);
        
    }
}
