package com.company;
import java.util.Scanner;

public class switch_01 {
    public static void main(String[] args) {

        System.out.println("Welcome to Calculator");
        System.out.println("-----------------------");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice(1-4): ");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.print("Enter a: ");
                int a = sc.nextInt();
                System.out.print("Enter b: ");
                int b = sc.nextInt();
                int sum = a+b;
                System.out.print("The sum of a and b is: "+sum);
                break;
            case 2:
                System.out.print("Enter c: ");
                int c = sc.nextInt();
                System.out.print("Enter d: ");
                int d = sc.nextInt();
                int sub = c-d;
                System.out.print("The difference of a and b is: "+sub);
                break;
            default:
                System.out.println("Error! Enter valid choice.");
        }


    }
}
